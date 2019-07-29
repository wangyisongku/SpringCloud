package com.wys.fallback;

import com.wys.bean.ProductBean;
import com.wys.service.ProductBeanService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.fallback
 * @ClassName: ProductBeanFallBack
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/7/29 12:07
 * @Version: 1.0
 */
@Component
public class ProductBeanFallBack implements ProductBeanService {

    @Override
    public ProductBean loadByItemCode(String itemCode) {
//        return "all,网络异常，请稍后再试。。。";
        return new ProductBean("one", "one", "one", 0);
    }

    @Override
    public List<ProductBean> findAll() {
//        return "one,网络异常，请稍后再试。。。";
        return new ArrayList<ProductBean>();
    }
}
