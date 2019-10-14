package com.dengxin.learn.spring.ioc.soundsystem;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author DengXin
 * @date 2019/10/14 2:28 PM
 */
@Component
@Data
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

//    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
