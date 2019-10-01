package com.example.springdemo.concurrent;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
//        super.run();
        System.out.println("run thread!");
    }

    public static void main(String[] args) {
        Thread th = new Thread(){
            @Override
            public void run() {
                System.out.println("thread is running!");
            }
        };
        System.out.println(th.getName());
    }
}
