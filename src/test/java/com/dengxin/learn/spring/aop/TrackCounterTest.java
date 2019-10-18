package com.dengxin.learn.spring.aop;

import com.dengxin.learn.spring.ioc.soundsystem.CompactDisc;
import com.dengxin.learn.spring.ioc.soundsystem.TrackCounter;
import com.dengxin.learn.spring.ioc.soundsystem.TrackCounterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DengXin
 * @date 2019/10/18 3:41 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {
        cd.playTrack(1);
        cd.playTrack(3);
        cd.playTrack(5);
        cd.playTrack(3);
        cd.playTrack(2);
        cd.playTrack(4);
        cd.playTrack(3);

        System.out.println("Track 1:" + counter.getPlayCount(1));
        System.out.println("Track 2:" + counter.getPlayCount(2));
        System.out.println("Track 3:" + counter.getPlayCount(3));
        System.out.println("Track 4:" + counter.getPlayCount(4));
        System.out.println("Track 5:" + counter.getPlayCount(5));
    }
}
