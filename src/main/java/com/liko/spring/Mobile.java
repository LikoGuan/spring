package com.liko.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by likoguan on 21/03/18.
 */
public class Mobile implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationListener<MessageEvent> {

    private Integer price;

    private String make;

    //被@PostConstruct注释的方法，将被被CommonAnnotationBeanPostProcessor前置方法 调用
    @PostConstruct
    void postConstruct() {//5
        System.out.println("Mobile.postConstruct");
    }

    void initMethod() {//7 custom init-method
        System.out.println("Mobile.init-method");
    }

    //被@PreDestroy注释的方法，将被被CommonAnnotationBeanPostProcessor前置方法 调用
    @PreDestroy
    void preDestroy() {
        System.out.println("Mobile.preDestroy");
    }

    void destroyMethod() {
        System.out.println("Mobile.destroyMethod");
    }

    //------------------------------------------------------------
    @Override
    public void destroy() throws Exception {
        System.out.println("Mobile.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {//6 InitializingBean
        System.out.println("Mobile.afterPropertiesSet");
    }


    //-------------------------------------------------------------
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {//1 Populate properties
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    //很明显可以有很多的BeanPostProcessor，按照Order接口实现的顺序来排序？
    public void setMake(String make) {//4 XBeanPostProcessor 会调用
        this.make = make;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {//3 BeanFactoryAware
        System.out.println("Mobile.setBeanFactory:" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {//2 BeanNameAware
        System.out.println("Mobile.setBeanName:" + name);
    }

    @Override
    public void onApplicationEvent(MessageEvent event) {
        System.out.println(event.getMessage());
    }
}
