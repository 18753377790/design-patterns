package com.state;

/**
 * @Author 李非凡
 * @Description:
 * 结束状态
 * @Date 2019/7/10 20:42
 * @Version 1.0
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
