package com.second.question;

class Singleton1
{
	private static Singleton1 ms;
	public String s;
	private Singleton1()
	{
		s="apoorva";
	}
	public static Singleton1 getInstance() {
		ms=new Singleton1();
		return ms;
	}
}
public class Main3 {
	public static void main(String[] args) {
		Singleton1 ms1=Singleton1.getInstance();
		Singleton1 ms2=Singleton1.getInstance();
		Singleton1 ms3=Singleton1.getInstance();
		System.out.println(ms1.s);
		System.out.println(ms2.s);
		System.out.println(ms3.s);
	}

}
