package com.atguigu.mybatis.test;

public class Singletone {
	private volatile static Singletone singletone;
	
	
	private Singletone() {}
	
	public static Singletone getInstance() {
		if(singletone == null) {
			synchronized(Singletone.class) {
				if(singletone == null) {
					singletone = new Singletone();
				}
			}
		}
		return singletone;
	}
}

