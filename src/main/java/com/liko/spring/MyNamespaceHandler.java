package com.liko.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by likoguan on 19/03/18.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }

}
