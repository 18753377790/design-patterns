package com.state;

/**
 * @Author 李非凡
 * @Description:
 * 抽象出来的状态接口
 * @Date 2019/7/10 20:28
 * @Version 1.0
 */
public interface State {

    /**
     * 动作
     * @param context
     */
    void doAction(Context context);
}
