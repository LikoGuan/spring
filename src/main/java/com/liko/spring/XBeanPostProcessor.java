package com.liko.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by likoguan on 21/03/18.
 */
public class XBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("XBeanPostProcessor.postProcessBeforeInitialization");
        if (bean instanceof Mobile) {
            Mobile mobile = (Mobile)bean;
            mobile.setMake("XIAOMI");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("XBeanPostProcessor.postProcessAfterInitialization");
        return bean;
    }
}
