package com.dengxin.learn.spring.ioc.advanced.ambiguous;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author DengXin
 * @date 2019/10/17 10:28 AM
 */
@Component
//@Primary
@Qualifier("cookies")
public class Cookies implements Dessert {
    private String name = "cookies";
    private String taste = "sweet";

    @Override
    public void taste() {
        System.out.println("Dessert " + name + " taste " + taste);
    }
}
