package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author susu
 * @email a951666991@gmail.com
 * @date 2022-12-01 09:52:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
