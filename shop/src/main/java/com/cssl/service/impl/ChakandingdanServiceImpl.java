package com.cssl.service.impl;

import com.cssl.dao.ChakandingdanDao;
import com.cssl.pojo.OrderProduct;
import com.cssl.pojo.Porder;
import com.cssl.service.ChakandingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChakandingdanServiceImpl implements ChakandingdanService {

   @Autowired
    private ChakandingdanDao chakandingdanDao;

    @Override
    public List<Porder> chakanmydingdan(Porder porder){return chakandingdanDao.chakanmydingdan(porder);}

    @Override
    public List<OrderProduct> chakanmydingdanXq(OrderProduct orderProduct){return chakandingdanDao.chakanmydingdanXq(orderProduct);}
}
