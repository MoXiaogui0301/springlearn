package com.dengxin.learn.spring.ioc.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author DengXin
 * @date 2019/10/14 1:44 PM
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    /**
     * cdPlayer()通过调用sgtPeppers()注入自己所需的sgtPeppers对象
    @Bean
    public MediaPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    */

    /**
     * cdPlayer()通过构造器注入自己需要的sgtPeppers对象
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
    */

    /**
     * 使用Setter方法注入CDPlayer需要的sgtPeppers
     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        cdPlayer.setCd(compactDisc);
        return cdPlayer;
    }
}
