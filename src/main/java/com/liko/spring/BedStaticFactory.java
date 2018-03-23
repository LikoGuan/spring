package com.liko.spring;

/**
 * Created by likoguan on 12/10/17.
 */
public class BedStaticFactory {
    public static Bed createBed() {
        return new Bed(1, 1);
    }
}
