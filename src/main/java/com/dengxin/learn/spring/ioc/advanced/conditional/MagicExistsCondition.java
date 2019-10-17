package com.dengxin.learn.spring.ioc.advanced.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author DengXin
 * @date 2019/10/17 9:58 AM
 */
public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        Environment env = context.getEnvironment();
//        return env.containsProperty("magic");
        return true;
    }
}
