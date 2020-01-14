package com.adapter;

/**
 * @Author 李非凡
 * @Description:
 * 音频播放器
 * @Date 2019/7/10 15:29
 * @Version 1.0
 */
public class AudioPlayer implements MediaPlayer{

    /**
     * 实例化媒体适配器
     */
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 播放 mp3 音乐文件的内置支持
        if (MediaEnum.MP3.getValue().equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        // mediaAdapter提供了播放其他文件格式的支持
        else if (MediaEnum.VLC.getValue().equalsIgnoreCase(audioType) || MediaEnum.MP4.getValue().equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        // 除此之外的其他格式不支持
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
