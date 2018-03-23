package com.liko.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by likoguan on 21/03/18.
 */
public class EventPublisher implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void publishEvent() {
        MessageEvent messageEvent = new MessageEvent("fuck you!", this);
        this.context.publishEvent(messageEvent);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            //
        }
    }
}
