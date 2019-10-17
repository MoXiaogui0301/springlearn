package com.dengxin.learn.spring.ioc.advanced.conditional;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DengXin
 * @date 2019/10/17 10:03 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBeanConfig.class)
public class MagicBeanTest {
    @Autowired
    private MagicBean magicBean;

    @Test
    public void magicBeanShouldNotBeNull() {
        assertNotNull(magicBean);
    }
}
