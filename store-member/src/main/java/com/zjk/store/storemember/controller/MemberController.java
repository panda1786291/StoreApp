package com.zjk.store.storemember.controller;

import java.util.Arrays;
import java.util.Map;

import com.zjk.store.storemember.feign.CouponFenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zjk.store.storemember.entity.MemberEntity;
import com.zjk.store.storemember.service.MemberService;
import com.zjk.common.utils.PageUtils;
import com.zjk.common.utils.R;



/**
 * 会员
 *
 * @author zjk
 * @email 759052104@qq.com
 * @date 2021-11-28 11:55:49
 */
@RestController
@RequestMapping("storemember/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFenService couponFenService;


    @RequestMapping("/coupons")
    public R testGetCoupons(){
        return couponFenService.memberCoupon();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("storemember:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("storemember:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("storemember:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("storemember:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("storemember:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
