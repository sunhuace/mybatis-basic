package com.atguigu.mybatis.test;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("dddddddddddd");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		t.start();
		t.interrupt();
		t.interrupted();
		System.out.println(t.isInterrupted());
		System.out.println("dddddddddddd");
		
		
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println(t.isInterrupted());
	}
}
