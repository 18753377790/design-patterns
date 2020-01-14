package com.state;

/**
 * @Author 李非凡
 * @Description:
 * 状态模式
 * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它所属的类。
 * @Date 2019/7/10 20:25
 * @Version 1.0
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
