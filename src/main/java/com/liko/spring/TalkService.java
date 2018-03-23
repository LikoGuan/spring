package com.liko.spring;

import org.springframework.stereotype.Service;

/**
 * Created by likoguan on 29/10/17.
 */
@Service("talk")
public class TalkService implements Talk {
    @Override
    public void doSomething() {
        System.out.println("TalkService.doSomething()");
    }
}

//xmlns:context="http://www.springframework.org/schema/context"
// http://www.springframework.org/schema/context
// http://www.springframework.org/schema/context/spring-context.xsd