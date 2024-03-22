package sxt.util;


import java.awt.*;

/**
 * 游戏工具类
 */
public class GameUtil {
    /**
     *该方法传入一个图片路径 读取图片
     */
    public static Image loadBufferedImage(String imgPath){
        Image image = Toolkit.getDefaultToolkit().createImage(imgPath);
        return image;
    }

}
