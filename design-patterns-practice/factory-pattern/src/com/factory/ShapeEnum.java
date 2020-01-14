package com.factory;

/**
 * @Author 李非凡
 * @Description:TODE
 * @Date 2020/1/6 20:46
 * @Version 1.0
 */
public enum ShapeEnum {

    /**
     *
     */
    SQUARE("square", "正方形"),

    /**
     *
     */
    CIRCLE("circle", "圆形"),

    /**
     *
     */
    RECTANGLE("rectangle", "矩形");

    private String value;

    private String name;

    ShapeEnum(String value, String name) {
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
        for (ShapeEnum category : ShapeEnum.values()) {
            if (category.getValue().equals(value)) {
                return category.getName();
            }
        }
        return null;
    }
}
