package com.zjk.store.storeorder.dao;

import com.zjk.store.storeorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-28 12:37:42
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
