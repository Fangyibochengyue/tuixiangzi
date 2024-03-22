package sxt.main;

import sxt.util.GameUtil;

import java.awt.*;

/**
 * 游戏背景类
 */
public class GameBackground {
    /**
     * 绘制游戏背景
     * @param g 用于绘制的图形上下文
     */
    public void draw(Graphics g){
        // 设置绘制颜色为红色，这里可以根据需要更改为其他颜色
        g.setColor(Color.red);

        // 使用绘制矩形的方式填充整个游戏窗口，创建背景
        // 这里的参数表示矩形左上角的坐标是(0, 0)，宽度为700，高度为700
        g.fillRect(0, 0, 700, 700);
    }
}