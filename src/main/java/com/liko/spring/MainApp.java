package com.liko.spring;

import com.liko.spring.aop.AService;
import com.liko.spring.aop.Perform;
import com.liko.spring.transaction.DefaultFooService;
import com.liko.spring.transaction.Foo;
import com.liko.spring.transaction.FooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CancellationException;

/**
 * Created by likoguan on 11/10/17.
 */
public class MainApp {
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");

//        EventPublisher publisher = (EventPublisher) applicationContext.getBean("eventPublisher");
//        publisher.publishEvent();
//
//        People people = (People) applicationContext.getBean("people");
//
        Speaker speaker = (Speaker)applicationContext.getBean("speaker");
        String message = speaker.speak();
//        logger.info(message);
//        speaker.talk();
//
        Car car = (Car)applicationContext.getBean("carFactoryBean");
        logger.info(car.toString());
        CarFactoryBean carFactoryBean = (CarFactoryBean)applicationContext.getBean("&carFactoryBean");
        logger.info(carFactoryBean.toString());

        Mobile mobile = (Mobile) applicationContext.getBean("mobile001");
        mobile.getPrice();
//
//        Bed bed1 = (Bed)applicationContext.getBean("bed1");
//        Bed bed2 = (Bed)applicationContext.getBean("bed2");
//
//        AService aService = (AService)applicationContext.getBean("aServiceImplProxy");
//        aService.barA();

//        Perform performer = (Perform)applicationContext.getBean("boy");
//        performer.sing();

//        FooService fooService = (FooService) applicationContext.getBean("fooService");
//        fooService.insertFoo (new Foo());

//        DefaultFooService fooService = (DefaultFooService) applicationContext.getBean("fooService");
//        fooService.updateFoo(null);
        return;
    }

}
