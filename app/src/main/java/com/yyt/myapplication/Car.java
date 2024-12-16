package com.yyt.myapplication;

import java.util.Optional;

public class Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Optional<Engine> getEngineWithOp() {
        return Optional.ofNullable(engine);
    }
}
