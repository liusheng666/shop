package com.cssl.controller;

import com.cssl.pojo.*;
import com.cssl.service.ChakandingdanService;
import com.cssl.service.UserdingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 我的订单控制器
 * */
@Controller
public class UserdingdanController {
    @Autowired
    private UserdingdanService userdingdanService;

    @Autowired
    private ChakandingdanService chakandingdanService;

    /**
     * 查询我的订单前三条
     * */
    @RequestMapping("/listmydingdan")
    public String listmydingdan(HttpSession session,User user,Dingdanzt dingdanzt,Porder porder){
        User user1 =(User) session.getAttribute("user");
        int uid=user1.getUid();
        porder.setUid(uid);
        List<Porder> ulist =userdingdanService.mydingdao(porder);//查询订单表

        OrderProduct orderProduct = new OrderProduct();
        Product product = new Product();
        for (Porder Porder:ulist
             ) {
            orderProduct.setOcode(Porder.getOcode());
            OrderProduct ddxqlist= userdingdanService.mydingdanorder(orderProduct);
            product.setPcode(ddxqlist.getPcode());
            Product pimage= userdingdanService.mydingdanimage(product);
            Porder.setProduct(pimage);
        }
        session.setAttribute("ulist",ulist);
        return "forward:ger_zhongx";
    }

    /**
     * 查询我的订单
     * */
    @RequestMapping("/listmydingdanAll")
    public String listmydingdanAll(HttpSession session,User user,Dingdanzt dingdanzt,Porder porder){
        User user1 =(User) session.getAttribute("user");
        int uid=user1.getUid();
        porder.setUid(uid);
        List<Porder> ulist =userdingdanService.mydingdaoAll(porder);//查询订单表

        OrderProduct orderProduct = new OrderProduct();
        Product product = new Product();
        for (Porder Porder:ulist
                ) {
            orderProduct.setOcode(Porder.getOcode());
            OrderProduct ddxqlist= userdingdanService.mydingdanorder(orderProduct);
            product.setPcode(ddxqlist.getPcode());
            Product pimage= userdingdanService.mydingdanimage(product);
            Porder.setProduct(pimage);
        }
        session.setAttribute("ulist",ulist);
        return "forward:ger_zhongx";
    }

    /**
     * 查看我的订单详情
     **/
    @RequestMapping("/ChakandingdanxiangQ")
    public String ChakandingdanxiangQ(HttpSession session,int pid,String pimage){
        session.setAttribute("pimage",pimage);
        System.out.printf("pid:"+pid);
        Porder porder=new Porder();
        porder.setPorderid(pid);
        List<Porder> ckulist= chakandingdanService.chakanmydingdan(porder);
        session.setAttribute("ckulist",ckulist);
        String dd=ckulist.get(0).getOcode();//获取订单编号
        System.out.printf("订单编号:"+dd);
        OrderProduct orderProduct =new OrderProduct();
        orderProduct.setOcode(dd);
        List<OrderProduct> orderlist= chakandingdanService.chakanmydingdanXq(orderProduct);
        session.setAttribute("orderlist",orderlist);
        return  "forward:dingd_xiangq";
    }
}
