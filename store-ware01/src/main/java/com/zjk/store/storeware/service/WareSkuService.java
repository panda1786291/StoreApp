package com.zjk.store.storeware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjk.common.utils.PageUtils;
import com.zjk.store.storeware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-28 13:31:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

