package com.yyt.myapplication;

import java.util.Optional;

/**
 * @Description: 发动机
 * @ClassName Engine
 * @Author 刘伟
 * @Date 2024-12-06 23:26
 */
public class Engine {
    private final String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getNameWithOp() {
        return Optional.ofNullable(name);
    }
}
