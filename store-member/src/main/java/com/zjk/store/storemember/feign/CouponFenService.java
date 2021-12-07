package com.zjk.store.storemember.feign;

import com.zjk.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "store-coupon")
@RequestMapping("storecoupon/coupon")
public interface CouponFenService {
    @RequestMapping("/coupons")
    public R memberCoupon();
}
