package com.liko.spring;

import com.liko.spring.aop.AService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by likoguan on 29/10/17.
 */
@Service("talk")
public class TalkService implements Talk {
//    @Resource(name = "aServiceImplProxy")
//    private AService aService;

    @Override
    public void doSomething() {
        //aService.barA();
        System.out.println("TalkService.doSomething()");
    }
}

//xmlns:context="http://www.springframework.org/schema/context"
// http://www.springframework.org/schema/context
// http://www.springframework.org/schema/context/spring-context.xsd