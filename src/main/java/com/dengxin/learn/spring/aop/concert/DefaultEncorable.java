package com.dengxin.learn.spring.aop.concert;

/**
 * @author DengXin
 * @date 2019/10/19 10:18 AM
 */
public class DefaultEncorable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("Encore!Encore!Encore!");
    }
}
