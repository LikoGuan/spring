package com.liko.spring;

/**
 * Created by likoguan on 12/10/17.
 */
public class BedNonStaticFactory {
    public Bed createBed() {
        return new Bed(2, 2);
    }
}
