package com.cloud.cloudbootprovidertrade.mapper;

import com.cloud.po.ItripHotelOrder;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper
public interface ItripHotelOrderMapper {

	/**支付前订单展示*/
	public List<ItripHotelOrder>	getItripHotelOrderListByMap(Map<String, Object> param)throws Exception;

	/**
	 * 通过订单编号修改订单状态为已支付
	 *
	 * */
	public Integer updateHotelOrderorderNoStatus(Map<String ,Object> param)throws Exception;
	/**
	 * 通过订单编号修改订单状态为已入住
	 *
	 * */
	public Integer updateHotelOrderorderNoStatusT(Map<String ,Object> param)throws Exception;


}
