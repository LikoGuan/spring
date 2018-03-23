package com.liko.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by likoguan on 11/10/17.
 */
public class MainApp {
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");

        EventPublisher publisher = (EventPublisher) applicationContext.getBean("eventPublisher");
        publisher.publishEvent();

        People people = (People) applicationContext.getBean("people");

        Speaker speaker = (Speaker)applicationContext.getBean("speaker");
        String message = speaker.speak();
        logger.info(message);
        speaker.talk();

        Car car = (Car)applicationContext.getBean("carFactoryBean");
        logger.info(car.toString());
        CarFactoryBean carFactoryBean = (CarFactoryBean)applicationContext.getBean("&carFactoryBean");
        logger.info(carFactoryBean.toString());

        Bed bed1 = (Bed)applicationContext.getBean("bed1");
        Bed bed2 = (Bed)applicationContext.getBean("bed2");
    }
}
