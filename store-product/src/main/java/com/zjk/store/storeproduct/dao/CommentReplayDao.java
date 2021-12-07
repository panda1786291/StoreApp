package com.zjk.store.storeproduct.dao;

import com.zjk.store.storeproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-27 20:05:11
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
