package com.factory;

/**
 * @Author 李非凡
 * @Description: 工厂枚举类型
 * @Date 2020/1/14 9:53
 * @Version 1.0
 */
public enum FactoryEnum {
    /**
     *
     */
    COLOR("COLOR",""),
    /**
     *
     */
    BLUE("BLUE",""),
    /**
     *
     */
    GREEN("GREEN",""),
    /**
     *
     */
    RED("RED",""),
    /**
     *
     */
    SHAPE("SHAPE",""),
    /**
     *
     */
    CIRCLE("CIRCLE",""),
    /**
     *
     */
    RECTANGLE("RECTANGLE",""),
    /**
     *
     */
    SQUARE("SQUARE","");

    private String value;

    private String name;

    FactoryEnum(String value, String name) {
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
        for (FactoryEnum category : FactoryEnum.values()) {
            if (category.getValue().equals(value)) {
                return category.getName();
            }
        }
        return null;
    }
}
