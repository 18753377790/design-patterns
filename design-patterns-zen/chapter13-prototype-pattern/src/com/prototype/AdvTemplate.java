package com.prototype;

/**
 * @Author 李非凡
 * @Description: 广告信模板
 * @Date 2020/9/25 14:53
 * @Version 1.0
 */
public class AdvTemplate {

    /**
     * 广告信名称
     */
    private String advSubject = "济宁银行国庆信用卡抽奖活动";

    /**
     * 广告信内容
     */
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！...";

    /**
     * 取得广告信名称
     * @return 广告信名称
     */
    public String getAdvSubject() {
        return advSubject;
    }

    /**
     * 取得广告信内容
     * @return 广告信内容
     */
    public String getAdvContext() {
        return advContext;
    }
}
