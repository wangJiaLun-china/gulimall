package com.atguigu.gulimall.gulimall.product;

import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        brandService.save(brandEntity);
        List<BrandEntity> list= brandService.list(new QueryWrapper<BrandEntity>()
        .eq("brand_id", 1L));
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity.getDescript());
        }
    }


}
