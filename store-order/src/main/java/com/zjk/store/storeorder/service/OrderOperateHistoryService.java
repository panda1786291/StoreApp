package com.zjk.store.storeorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjk.common.utils.PageUtils;
import com.zjk.store.storeorder.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-28 12:37:42
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

