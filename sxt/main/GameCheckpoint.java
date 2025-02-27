package sxt.main;

/**
 * 绘制游戏地图
 */
public class GameCheckpoint {
    //第一关
    //0代表空  1代表白块  2代表蓝块  3代表黑块  4代表黄块
    int[][] box1 = {
            {0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 1, 3, 1, 0, 0, 0},
            {0, 0, 1, 2, 1, 1, 1, 1},
            {1, 1, 1, 4, 2, 4, 3, 1},
            {1, 3, 2, 4, 2, 1, 1, 1},
            {1, 1, 1, 1, 4, 1, 0, 0},
            {0, 0, 0, 1, 3, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0}
    };
    int[][] box1Rest = {
            {0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 1, 3, 1, 0, 0, 0},
            {0, 0, 1, 2, 1, 1, 1, 1},
            {1, 1, 1, 4, 2, 4, 3, 1},
            {1, 3, 2, 4, 2, 1, 1, 1},
            {1, 1, 1, 1, 4, 1, 0, 0},
            {0, 0, 0, 1, 3, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0}
    };

    //第二关
    //0代表空  1代表白块  2代表蓝块  3代表黑块  4代表黄块
    int[][] box2 = {
            {1, 1, 1, 1, 1, 0, 0, 0, 0},
            {1, 2, 2, 2, 1, 0, 0, 0, 0},
            {1, 2, 4, 4, 1, 0, 1, 1, 1},
            {1, 2, 4, 2, 1, 0, 1, 3, 1},
            {1, 1, 1, 2, 1, 1, 1, 3, 1},
            {0, 1, 1, 2, 2, 2, 2, 3, 1},
            {0, 1, 2, 2, 2, 1, 2, 2, 1},
            {0, 1, 2, 2, 2, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 0, 0, 0}
    };
    int[][] box2Rest = {
            {1, 1, 1, 1, 1, 0, 0, 0, 0},
            {1, 2, 2, 2, 1, 0, 0, 0, 0},
            {1, 2, 4, 4, 1, 0, 1, 1, 1},
            {1, 2, 4, 2, 1, 0, 1, 3, 1},
            {1, 1, 1, 2, 1, 1, 1, 3, 1},
            {0, 1, 1, 2, 2, 2, 2, 3, 1},
            {0, 1, 2, 2, 2, 1, 2, 2, 1},
            {0, 1, 2, 2, 2, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 0, 0, 0}
    };
    //第三关
    //0代表空  1代表白块  2代表蓝块  3代表黑块  4代表黄块
    int[][] box3 = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 2, 2, 2, 2, 2, 1, 1, 1},
            {1, 1, 4, 1, 1, 1, 2, 2, 2, 1},
            {1, 2, 2, 2, 4, 2, 2, 4, 2, 1},
            {1, 2, 3, 3, 1, 2, 4, 2, 1, 1},
            {1, 1, 3, 3, 1, 2, 2, 2, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}
    };
    int[][] box3Rest = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 2, 2, 2, 2, 2, 1, 1, 1},
            {1, 1, 4, 1, 1, 1, 2, 2, 2, 1},
            {1, 2, 2, 2, 4, 2, 2, 4, 2, 1},
            {1, 2, 3, 3, 1, 2, 4, 2, 1, 1},
            {1, 1, 3, 3, 1, 2, 2, 2, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}
    };
}
