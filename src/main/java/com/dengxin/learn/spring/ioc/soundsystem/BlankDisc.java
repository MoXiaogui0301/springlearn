package com.dengxin.learn.spring.ioc.soundsystem;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author DengXin
 * @date 2019/10/18 3:34 PM
 */
@Data
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    @Override
    public void play() {

    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println(artist+" plays track " + trackNumber);
    }
}
