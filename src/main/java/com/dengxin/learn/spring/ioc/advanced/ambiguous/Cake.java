package com.dengxin.learn.spring.ioc.advanced.ambiguous;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author DengXin
 * @date 2019/10/17 10:27 AM
 */
@Component
@Qualifier("cake")
public class Cake implements Dessert {
    private String name = "cake";
    private String taste = "nice";

    @Override
    public void taste() {
        System.out.println("Dessert " + name + " taste " + taste);
    }
}
