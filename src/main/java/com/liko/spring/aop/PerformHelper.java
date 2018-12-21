package com.liko.spring.aop;

/**
 * Created by likoguan on 2/12/18.
 */
public class PerformHelper {
    public void beforePerform() {
        System.out.println("before perform");
    }

    public void afterPerform() {
        System.out.println("after perform");
    }
}
