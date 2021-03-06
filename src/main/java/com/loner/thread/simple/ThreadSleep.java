package com.loner.thread.simple;

/**
 * 线程的调度-休眠
 */
public class ThreadSleep {
	public static void main(String[] args) {
		ThreadSleep sleep = new ThreadSleep();
		Thread t1 = sleep.new MyThread1();
		Thread t2 = new Thread(sleep.new MyRunnable());
		t1.start();
		t2.start();
	}

	class MyThread1 extends Thread {
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("线程1第" + i + "次执行！");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class MyRunnable implements Runnable {
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("线程2第" + i + "次执行！");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}