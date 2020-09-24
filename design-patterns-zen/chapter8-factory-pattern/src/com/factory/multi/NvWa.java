package com.factory.multi;

import com.factory.BlackHuman;
import com.factory.Human;
import com.factory.WhiteHuman;
import com.factory.YellowHuman;

/**
 * @Author 李非凡
 * @Description:TODE
 * @Date 2020/9/23 11:30
 * @Version 1.0
 */
public class NvWa {

    public static void main(String[] args) {
        // 女娲第一次造人
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        // 女娲第二次造人
        System.out.println("--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        // 女娲第三次造人
        System.out.println("--造出的第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
