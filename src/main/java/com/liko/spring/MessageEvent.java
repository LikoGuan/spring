package com.liko.spring;

import org.springframework.context.ApplicationEvent;

/**
 * Created by likoguan on 21/03/18.
 */
public class MessageEvent extends ApplicationEvent {

    private String message;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MessageEvent(String message, Object source) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
