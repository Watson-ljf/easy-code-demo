package com.vue;

public class DeadLockTest {
    private static String a = "a";
    private static String b = "b";
    private static  Integer aLockFlag = 0;
    private static  Integer bLockFlag = 0;

    public static void main(String[] args) {
        new Thread("线程1") {
            @Override
            public void run() {
                synchronized (a) {
                    System.out.println("线程1对a加锁成功。");
                    // 加锁标记
                    aLockFlag = 1;
                    while (true) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (bLockFlag == 1) {
                            synchronized (b) {
                                System.out.println("对b加锁成功。");
                                break;
                            }
                        }
                    }
                }
            }
        }.start();

        new Thread("线程2") {
            @Override
            public void run() {
                synchronized (b) {
                    System.out.println("线程2对b加锁成功。");
                    // 加锁标记
                    bLockFlag = 1;
                    while (true) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (aLockFlag == 1) {
                            synchronized (a) {
                                System.out.println("线程2对a加锁成功。");
                                break;
                            }
                        }
                    }
                }
            }
        }.start();
    }
}
