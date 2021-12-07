package com.zjk.store.storecoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjk.common.utils.PageUtils;
import com.zjk.store.storecoupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-27 21:28:02
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

