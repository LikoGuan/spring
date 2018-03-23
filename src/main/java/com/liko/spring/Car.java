package com.liko.spring;

/**
 * Created by likoguan on 11/10/17.
 */
public class Car {
    private Integer length;

    private Integer width;

    private Integer weight;

    public Car(Integer length, Integer width, Integer weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car[length=" + this.length + " width=" + this.width + " weight=" + this.weight + "]";
    }
}
