package com.dengxin.learn.spring.aop.concert;

import org.springframework.stereotype.Component;

/**
 * @author DengXin
 * @date 2019/10/18 2:49 PM
 */
@Component
public class Performance {

    public void perform() {
        System.out.println("Performing concert");
    }
}
