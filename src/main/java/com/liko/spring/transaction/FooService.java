package com.liko.spring.transaction;

/**
 * Created by likoguan on 3/12/18.
 */
public interface FooService {
    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}
