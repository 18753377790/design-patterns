package com.state;

/**
 * @Author 李非凡
 * @Description:
 * 开始状态
 * @Date 2019/7/10 20:46
 * @Version 1.0
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
