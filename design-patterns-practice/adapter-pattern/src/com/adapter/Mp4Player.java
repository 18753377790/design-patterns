package com.adapter;

/**
 * @Author 李非凡
 * @Description:
 * MP4播放器
 * @Date 2019/7/10 15:32
 * @Version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
