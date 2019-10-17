package com.dengxin.learn.spring.ioc.advanced.ambiguous;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author DengXin
 * @date 2019/10/17 10:30 AM
 */
@Component
@Qualifier("icecream")
public class IceCream implements Dessert {
    private String name = "icecream";
    private String taste = "clear";

    @Override
    public void taste() {
        System.out.println("Dessert " + name + " taste " + taste);
    }
}
