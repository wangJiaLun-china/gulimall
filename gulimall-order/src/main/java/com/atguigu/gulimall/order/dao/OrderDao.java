package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangJialun
 * @email 961105114@qq.com
 * @date 2021-02-13 12:32:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
