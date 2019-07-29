package com.wys.controller;

import com.wys.bean.ProductBean;
import com.wys.service.ProductBeanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.controller
 * @ClassName: ProductBeanController
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/4/22 22:25
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping(value = "product")
public class ProductBeanController {

    @Autowired
    private ProductBeanService productBeanService;

    @GetMapping(value = "products")
    public List<ProductBean> list() {
        return this.productBeanService.findAll();
    }

    @GetMapping(value = "/{itemCode}")
    public ProductBean detail(@PathVariable String itemCode) {
        return this.productBeanService.loadByItemCode(itemCode);
    }
}
