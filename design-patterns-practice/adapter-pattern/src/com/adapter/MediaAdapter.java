package com.adapter;

/**
 * @Author 李非凡
 * @Description:
 * 媒体适配器
 * 是媒体播放器和高级媒体播放器这两个不兼容的接口之间的桥梁
 * @Date 2019/7/10 15:29
 * @Version 1.0
 */
public class MediaAdapter implements MediaPlayer{

    /**
     * 实例化高级媒体播放器
     */
    private AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 构造方法
     * @param audioType
     */
    public MediaAdapter(String audioType){
        if (MediaEnum.VLC.getValue().equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if (MediaEnum.MP4.getValue().equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (MediaEnum.VLC.getValue().equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if (MediaEnum.MP4.getValue().equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
