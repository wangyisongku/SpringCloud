package com.wys.controller;

import com.wys.bean.ProductBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.controller
 * @ClassName: ProductBeanController
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/4/22 22:07
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping(value = "product")
public class ProductBeanController {

    @Value("${server.port}")
    private int port;

    @GetMapping(value = "products")
    public List<ProductBean> list() {
        System.out.println("port：" + port);
        return this.buildProducts();
    }

    @GetMapping(value = "/{itemCode}")
    public ProductBean detail(@PathVariable String itemCode) {
        List<ProductBean> products = this.buildProducts();
        for (ProductBean product : products) {
            if (product.getItemCode().equalsIgnoreCase(itemCode))
            {
                System.out.println("port：" + port);
                return product;
            }
        }
        return null;
    }

    protected List<ProductBean> buildProducts() {
        List<ProductBean> products = new ArrayList<ProductBean>();
        products.add(new ProductBean("item-1", "测试商品-1", "TwoStepsFromJava", 100));
        products.add(new ProductBean("item-2", "测试商品-2", "TwoStepsFromJava", 200));
        products.add(new ProductBean("item-3", "测试商品-3", "TwoStepsFromJava", 300));
        products.add(new ProductBean("item-4", "测试商品-4", "TwoStepsFromJava", 400));
        products.add(new ProductBean("item-5", "测试商品-5", "TwoStepsFromJava", 500));
        products.add(new ProductBean("item-6", "测试商品-6", "TwoStepsFromJava", 600));
        return products;
    }
}
