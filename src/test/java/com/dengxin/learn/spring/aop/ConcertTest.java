package com.dengxin.learn.spring.aop;

import com.dengxin.learn.spring.aop.concert.Audience;
import com.dengxin.learn.spring.aop.concert.ConcertConfig;
import com.dengxin.learn.spring.aop.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DengXin
 * @date 2019/10/18 2:48 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {

    @Autowired
    Performance performance;

    @Autowired
    Audience audience;

    @Test
    public void testTrackCounter() {
        performance.perform();
    }
}
