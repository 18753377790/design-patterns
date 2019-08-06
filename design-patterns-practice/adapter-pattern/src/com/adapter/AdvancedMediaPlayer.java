package com.adapter;

/**
 * @Author 李非凡
 * @Description:
 * 高级媒体播放器
 * @Date 2019/7/10 15:12
 * @Version 1.0
 */
public interface AdvancedMediaPlayer {

    /**
     * 使用VLC播放器播放VLC格式
     * @param fileName
     */
    default void playVlc(String fileName) {

    }

    /**
     * 使用MP4播放器播放MP4格式
     * @param fileName
     */
    default void playMp4(String fileName) {

    }
}
