package com.state;

/**
 * @Author 李非凡
 * @Description:
 * 状态管理类
 * @Date 2019/7/10 20:28
 * @Version 1.0
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
