package com.dengxin.learn.spring.ioc.advanced.ambiguous;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DengXin
 * @date 2019/10/17 10:34 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertBeanTest {
//    @Autowired
//    Dessert cake;

    @Autowired@Qualifier("cake")
    Dessert dessert;

    @Test
    public void dessertShouldNotBeNull() {
        assertNotNull(dessert);
    }

    @Test
    public void tasteDessert() {
        dessert.taste();
    }
}
