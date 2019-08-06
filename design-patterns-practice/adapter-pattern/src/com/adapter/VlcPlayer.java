package com.adapter;

/**
 * @Author 李非凡
 * @Description:
 * VLC播放器
 * @Date 2019/7/10 15:32
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
