package com.tuling.netty.adapter;

public class MyAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adpteeRequest();
    }


    public static void main(String[] args) {
        new MyAdapter().request();
    }
}
