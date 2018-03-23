package com.liko.spring;

/**
 * Created by likoguan on 12/10/17.
 */
public class Bed {
    private Integer length;

    private Integer width;

    public Bed(Integer length, Integer width) {
        this.length = length;
        this.width = width;
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
}
