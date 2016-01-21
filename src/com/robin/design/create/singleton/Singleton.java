package com.robin.design.create.singleton;

//懒汉式单例类.在第一次调用的时候实例化自己   
public class Singleton {

	private Singleton(){}
	
	private static Singleton single = null;
	
	//静态工厂方法  --- 线程不安全
//	public static Singleton getInstance(){
//		if(single==null){
//			single = new Singleton();
//		}
//		return single;
//	}
	
//	//1.在getInstance方法上加同步
//	public synchronized static Singleton getInstance(){
//		if(single==null){
//			single = new Singleton();
//		}
//		return single;
//	}
	
//	//2.双重检查锁定
//	public static Singleton getInstance(){
//		if(single==null){
//			synchronized (Singleton.class) {
//				if(single==null){
//					single = new Singleton();
//				}
//			}
//		}
//		return single;
//	}
	
	//3.静态内部类
	//这种比上面1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响。
	private static class LazyHolder{
		private static final Singleton INSTANCE = new Singleton();
	} 
	
	public static final Singleton getInstance(){
		return LazyHolder.INSTANCE;
	}
	
}
