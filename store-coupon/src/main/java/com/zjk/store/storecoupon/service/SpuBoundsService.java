package com.zjk.store.storecoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjk.common.utils.PageUtils;
import com.zjk.store.storecoupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-27 21:28:02
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

