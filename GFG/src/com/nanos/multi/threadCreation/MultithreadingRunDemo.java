package com.nanos.multi.threadCreation;

public class MultithreadingRunDemo {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Runnable lm = new MultiThreadRun();
            Thread object
                    = new Thread(lm);
            object.start();

        }

        // using lambda and function interface
//        Runnable lmm = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("lm");
//                try{
//                    System.out.println(Thread.currentThread().getName());
//                }catch (Exception ex){
//                    System.out.println(ex.getMessage());
//                }
//            }
//        };
        for (int i = 0; i < 6; i++) {
            Thread object
                    = new Thread(()->{
                System.out.println("lmmmm");
                try{
                    System.out.println(Thread.currentThread().getName());
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            });
            object.start();

        }
    }
}

class MultiThreadRun implements Runnable{

    public void run(){
        try{
            System.out.println(Thread.currentThread().getName());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
