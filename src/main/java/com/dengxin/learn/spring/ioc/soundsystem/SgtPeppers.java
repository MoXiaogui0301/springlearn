package com.dengxin.learn.spring.ioc.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author DengXin
 * @date 2019/10/14 11:39 AM
 */
//@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
