package com.dengxin.learn.spring.aop.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author DengXin
 * @date 2019/10/19 10:16 AM
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.dengxin.learn.spring.aop.concert.Performance+", defaultImpl = DefaultEncorable.class)
    public static Encoreable encoreable;
}
