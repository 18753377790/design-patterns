package com.factory;

/**
 * @Author 李非凡
 * @Description: 女娲类
 * @Date 2020/9/23 9:43
 * @Version 1.0
 */
public class NvWa {

    public static void main(String[] args) {
        // 声明阴阳八卦炉
        AbstractHumanFactory yinYangLu = new HumanFactory();
        // 女娲第一次造人
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        // 女娲第二次造人
        System.out.println("--造出的第二批人是黑色人种--");
        Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        // 女娲第三次造人
        System.out.println("--造出的第三批人是黄色人种--");
        Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
