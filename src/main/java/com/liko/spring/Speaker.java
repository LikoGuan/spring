package com.liko.spring;

import javax.annotation.Resource;

/**
 * Created by likoguan on 11/10/17.
 */
public class Speaker {
    private String name;

    private String content;

    //private Address address;  //byName
    private Address myAddress;  //byType

    @Resource
    private Talk talk;

    public Speaker() {

    }

    public Speaker(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String speak() {
        return this.name + " say: " + this.content;
    }

    public void talk() {
        talk.doSomething();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Address getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(Address myAddress) {
        this.myAddress = myAddress;
    }

    /**
     * 不用注解只使用xml方式的自动装配，必须要要有setter方法
     */
//    public Talk getTalk() {
//        return talk;
//    }
//
//    public void setTalk(Talk talk) {
//        this.talk = talk;
//    }
}
