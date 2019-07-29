package com.wys.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.bean
 * @ClassName: ProductBean
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/4/22 21:59
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductBean implements Serializable{
    private static final long serialVersionUID = 2841015203521012138L;

    private String itemCode;                                    // 产品货号
    private String name;                                        // 产品名称
    private String bandName;                                    // 产品品牌名称
    private int price;                                          // 产品价格(分)
}
