package com.fc.singleton;

/**
 * 枚举单例
 */
public enum EnumSingleton {
    INSTANCE;
    private String name = "world";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

