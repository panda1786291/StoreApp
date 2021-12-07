package com.zjk.store.storeproduct;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.zjk.store.storeproduct.entity.BrandEntity;
import com.zjk.store.storeproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTest {
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米");
        brandEntity.setDescript("Mi11");
        brandService.updateById(brandEntity);
    }
}
