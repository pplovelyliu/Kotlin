package com.yyt.myapplication;

import java.util.Optional;
import java.util.function.Function;

/**
 * @Description: java程序入口
 * @ClassName Main
 * @Author 刘伟
 * @Date 2024-12-06 23:22
 */
public class Main {
    public static void main(String[] args) {
//        Function<Integer, Integer> add = (t)->2*t;
//        System.out.println("add result:" + add.apply(2));

        // 获取汽车发动机名
        Car car = new Car();
        //获取引擎名
        String engineName = getEngineName(car);
        System.out.println("engineName1:" + engineName);

        engineName = getEngineNameWithOptionalFlatMap(Optional.of(car));
        System.out.println("engineName2:" + engineName);

        engineName = getEngineNameWithOptionalMap(Optional.of(car));
        System.out.println("engineName3:" + engineName);
    }

    private static String getEngineName(Car car) {
        String name = null;
        if (car != null) {
            Engine engine = car.getEngine();
            if (engine != null) {
                name = engine.getName();
            }
        }
        return name == null ? "UnKnown" : name;
    }

    private static String getEngineNameWithOptionalFlatMap(Optional<Car> car) {
        return car.flatMap(Car::getEngineWithOp)
                .flatMap(Engine::getNameWithOp)
                .orElse("UnKnown");
    }

    private static String getEngineNameWithOptionalMap(Optional<Car> car) {
        return car.map(Car::getEngine)
                .map(Engine::getName)
                .orElse("UnKnown");
    }
}

