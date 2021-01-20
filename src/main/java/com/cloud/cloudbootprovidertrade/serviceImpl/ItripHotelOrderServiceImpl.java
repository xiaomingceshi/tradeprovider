package com.cloud.cloudbootprovidertrade.serviceImpl;

import com.cloud.cloudbootprovidertrade.mapper.ItripHotelOrderMapper;
import com.cloud.po.ItripHotelOrder;
import com.cloud.service.ItripHotelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: GaoJiaoKui
 * @time: 2020/12/28 19:57
 */
@Service
@Transactional
public class ItripHotelOrderServiceImpl implements ItripHotelOrderService {
@Autowired
private ItripHotelOrderMapper itripHotelOrderMapper;
    /**支付前订单展示*/
    @Override
    public ItripHotelOrder getItripHotelOrderListByMap(Map<String, Object> param) throws Exception {
        List<ItripHotelOrder> itripHotelOrderList=itripHotelOrderMapper.getItripHotelOrderListByMap(param);
        if (itripHotelOrderList.size()==1){//
            return itripHotelOrderList.get(0);
        }
        return null;
    }

    @Override
    public Integer updateHotelOrderorderNoStatus(Map<String, Object> param) throws Exception {
        return itripHotelOrderMapper.updateHotelOrderorderNoStatus(param);
    }

    @Override
    public Integer updateHotelOrderorderNoStatusT(Map<String, Object> param) throws Exception {
        return itripHotelOrderMapper.updateHotelOrderorderNoStatusT(param);
    }
}
