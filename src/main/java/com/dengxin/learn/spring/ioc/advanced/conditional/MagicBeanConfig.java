package com.dengxin.learn.spring.ioc.advanced.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author DengXin
 * @date 2019/10/17 9:51 AM
 */
@Configuration
public class MagicBeanConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
