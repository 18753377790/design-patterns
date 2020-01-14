package com.adapter;

/**
 * @Author 李非凡
 * @Description:TODE
 * @Date 2020/1/6 20:32
 * @Version 1.0
 */
public enum MediaEnum {

    /**
     *
     */
    MP3("mp3", ""),
    /**
     *
     */
    MP4("mp4", ""),
    /**
     *
     */
    VLC("vlc", "");

    private String value;

    private String name;

    MediaEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getName(String value) {
        for (MediaEnum category : MediaEnum.values()) {
            if (category.getValue().equals(value)) {
                return category.getName();
            }
        }
        return null;
    }
}
