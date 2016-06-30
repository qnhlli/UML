package com.uml.qnhlli.myuml.aggregation;

/**
 * Created by qnhlli on 2016/6/30.
 * 聚合
 */
public class Car {
    private Engine engine;
    public Car(Engine engine)
    {
        this.engine = engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
}
