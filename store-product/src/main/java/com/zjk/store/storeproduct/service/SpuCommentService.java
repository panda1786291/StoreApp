package com.zjk.store.storeproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjk.common.utils.PageUtils;
import com.zjk.store.storeproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-27 20:05:11
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

