package com.cssl.controller;

import com.cssl.pojo.*;
import com.cssl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductDetailsController {
    @Autowired
    private ProductDetailsService productDetailsService;
    /**
     * 导航
     */
    @Autowired
    private SpService spService;

    /**
     * 订单
     */
    @Autowired
    private OrderProductService orderProductService;
    /**
     * 商铺
     */
    @Autowired
    private StoreService storeService;

    /**
     * 评价
     */
    @Autowired
    private Pleave_WordService pleave_wordService;

    @RequestMapping("/shangp_xiangq")
    public String shangp_xiangq(int productid, Model model) {
        int pwcount = pleave_wordService.pwCount(productid);
        int pwcounts = pleave_wordService.pwCounts(productid);
        Double pwc = ((pwcounts * 1.0) / (pwcount * 1.0)) * 100;
        model.addAttribute("pwc", pwc);
        //导航栏
        List<Spone> list = spService.oneList();
        //根据id查询商品详情
        Product produc = productDetailsService.pDuct(productid);
        Map<String, Object> map = new HashMap<>();
        map.put("storeid", produc.getPguishu());
        //查询店铺
        Store store = storeService.st(map);
        //查询商品评论数
        int num = pleave_wordService.pwCount(productid);
        int typeid = store.getStrange();
        //热卖商品,,根据二级id
        List<OrderProduct> orderProductList = orderProductService.orderList2(typeid);
        //本店热卖
        List<OrderProduct> orderProductList1=orderProductService.orderList3(produc.getPguishu());
        //看了又看
        List<Product> productList = orderProductService.productListOne(store.getStcode());
        List<Product> productList2 = orderProductService.productListTwo(store.getStcode());
        Map<String, Object> map3 = new HashMap<>();
        map3.put("pid", produc.getPguishu());
        Map<String, Object> map1 = pleave_wordService.pwMap(map3);
        Double pfuwu = Double.valueOf(map1.get("pfuwu").toString());
        Double pshangpin = Double.valueOf(map1.get("pshangpin").toString());
        Double pwuliu = Double.valueOf(map1.get("pwuliu").toString());
        //满意度
        Double num2 = (pfuwu + pwuliu + pshangpin) / 3;
        Map<String, Object> map4 = new HashMap<>();
        map4.put("ppid", produc.getPguishu());
        map4.put("sid", 1);
        Map<String, Object> map2 = pleave_wordService.pwMap(map4);
        Double pfuwu2 = Double.valueOf(map2.get("pfuwu").toString());
        Double pwuliu2 = Double.valueOf(map2.get("pwuliu").toString());
        Double pshangpin2 = Double.valueOf(map2.get("pshangpin").toString());
        ProductDetails productDetails = productDetailsService.pD(productid);
        List<ProductPhotoDown> productPhotoDownList = productDetailsService.ppdList(productid);
        List<ProductPhotoUp> productPhotoUpList = productDetailsService.ppuList(productid);
        model.addAttribute("pfuwu", pfuwu);
        model.addAttribute("pwuliu", pwuliu);
        model.addAttribute("pshangpin", pshangpin);
        model.addAttribute("pfuwu2", pfuwu2);
        model.addAttribute("pwuliu2", pwuliu2);
        model.addAttribute("pshangpin2", pshangpin2);
        model.addAttribute("num2", num2);
        model.addAttribute("num", num);
        model.addAttribute("list", list);
        model.addAttribute("store", store);
        model.addAttribute("product", produc);
        model.addAttribute("productDetails", productDetails);
        model.addAttribute("productPhotoDownList", productPhotoDownList);
        model.addAttribute("productPhotoUpList", productPhotoUpList);
        model.addAttribute("opdlist", orderProductList);
        model.addAttribute("opdlist1", orderProductList1);
        model.addAttribute("productList", productList);
        model.addAttribute("productList2", productList2);
        return "shangp_xiangq";
    }

}
