package com.liko.spring.aop;

/**
 * Created by likoguan on 30/11/18.
 */
public class AServiceImpl implements AService {
    @Override
    public void fooA(String _msg) {
        System.out.println("AServiceImpl.fooA(msg:"+_msg+")");
    }

    @Override
    public void barA() {
        System.out.println("AServiceImpl.barA()");
    }
}
