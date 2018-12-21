package com.liko.spring.test;

import org.springframework.stereotype.Component;

/**
 * Created by likoguan on 2/12/18.
 */
@Component("baby")
public class Baby implements People {
    @Override
    public void eat(String food) {
        System.out.println("eat " + food);
    }

    @Override
    public Integer drink() {
        System.out.println("drink 1");
        return 1;
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
        throw new RuntimeException("can't wake up");
    }

    @Override
    public String watch(String movie) {
        System.out.println("watch " + movie);
        return "haha";
    }
}
