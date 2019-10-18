package com.dengxin.learn.spring.ioc.advanced.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DengXin
 * @date 2019/10/17 1:41 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class injectionTest {
    @Autowired
    BlankDisc blankDisc;

    @Test
    public void playDisc() {
        blankDisc.play();
    }
}
