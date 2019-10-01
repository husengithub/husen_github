package com.example.springdemo.concurrent;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("正在运行MyRunnable！");
    }


    public static void main(String[] args) {
        Runnable myRunnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("运行匿名Runable1");
            }
        };
        Runnable myRunnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("运行匿名Runable2");
            }
        };
        Thread thread = new Thread(myRunnable1);
        thread.start();
        Thread thread1 = new Thread(myRunnable2);
        thread1.start();


//        --------------------
        Runnable runnable = () -> {
            System.out.println("lambda表达式表示线程");
        };

        Thread thread3 = new Thread(runnable);
        thread3.start();

        System.out.println(thread);
        System.out.println(thread1);
        System.out.println(thread3);
        Thread thread4 = new Thread(new MyRunnable());
        thread4.start();
        System.out.println(thread4);
//        ============================
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    System.out.println("thread "+getName()+ " is created");
                }
            }.start();
        }
    }
}
