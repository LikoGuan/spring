package com.liko.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by likoguan on 11/10/17.
 */
public class CarFactoryBean implements FactoryBean<Car> {
    @Override
    public Car getObject() throws Exception {
        return new Car(5, 2, 2);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
