package com.liko.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by likoguan on 31/12/18.
 */
public class YBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("address");
        if (beanDefinition != null) {
            MutablePropertyValues mpv = beanDefinition.getPropertyValues();
            if (mpv.contains("street")) {
                mpv.add("street", "YuHang");
            }
        }
    }
}
