package Basic.多线程.util;/*
    
/**
  *@Author JunLin
  *@Date 2021/2/20
  *@Describe: 障碍
  CyclicBarrier实现让一组线程等待至某个状态之后再全部同时执行。
CyclicBarrier底层是
三个线程同时启动
 */

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args){
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName()+"：准备...");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"启动完毕："+new Date().getTime());
            }
        },"线程1").start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName()+"：准备...");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"启动完毕："+new Date().getTime());
            }
        },"线程2").start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName()+"：准备...");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"启动完毕："+new Date().getTime());
            }
        },"线程3").start();
    }
}
