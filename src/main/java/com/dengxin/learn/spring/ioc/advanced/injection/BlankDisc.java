package com.dengxin.learn.spring.ioc.advanced.injection;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author DengXin
 * @date 2019/10/17 11:33 AM
 */
public class BlankDisc {
    private String title;
    private String artist;

    public BlankDisc(String title,String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("artist " + artist + " plays " + title);
    }
}
