package com.adapter;

/**
 * @Author 李非凡
 * @Description:
 * 媒体播放器
 * @Date 2019/7/10 14:59
 * @Version 1.0
 */
public interface MediaPlayer {

    /**
     * 使用播放器播放媒体文件
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
