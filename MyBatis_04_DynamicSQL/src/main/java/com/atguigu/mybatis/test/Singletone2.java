package com.atguigu.mybatis.test;

public class Singletone2 {

	private Singletone2() {

	}

	private static class Inner {
		static Singletone2 singletone= new Singletone2();
	}

	public static Singletone2 getInstance() {
		return Inner.singletone;
	}

}
