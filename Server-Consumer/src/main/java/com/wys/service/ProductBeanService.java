package com.wys.service;

import com.wys.bean.ProductBean;
import com.wys.fallback.ProductBeanFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.service
 * @ClassName: ProductBeanService
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/4/22 22:21
 * @Version: 1.0
 */
@FeignClient(name = "server-provider", fallback = ProductBeanFallBack.class)
public interface ProductBeanService {

    @GetMapping(value = "/product/products")
    List<ProductBean> findAll();

    @GetMapping(value = "/product/{itemCode}")
    ProductBean loadByItemCode(@PathVariable("itemCode") String itemCode);
}
