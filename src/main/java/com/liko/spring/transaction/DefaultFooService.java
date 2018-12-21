package com.liko.spring.transaction;

/**
 * Created by likoguan on 3/12/18.
 */
public class DefaultFooService /*implements FooService*/ {
    //@Override
    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    //@Override
    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    //@Override
    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    //@Override
    public void updateFoo(Foo foo) {
        insertFoo(foo);
        throw new UnsupportedOperationException();
    }
}
