package sxt.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

/**
 * 游戏背景音乐
 */
public class Music {
    private static AudioClip fly;  // wav类型的音频

    /**
     * 加载音频文件
     */
    public static void load() {
        try {
            // 加载音频文件（mc.wav）
            fly = Applet.newAudioClip(new File("music/mc.wav").toURL());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 播放背景音乐（循环播放）
     */
    public static void playFly() {
        // 重复播放音频
        fly.loop();
    }
}