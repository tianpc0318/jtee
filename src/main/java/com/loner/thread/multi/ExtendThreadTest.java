package com.loner.thread.multi;

public class ExtendThreadTest {

	public static void main(String[] args) {

//		ExtendThread ext = new ExtendThread();
//		ext.start();
		Thread t = new Thread() {
			public void run() {
				System.out.println("通过创建Thread的匿名子类... ...");
			}
		};
		t.start();

	}

}
