package com.robin.design.create.prototype;

public class TestMain {

	/**
	 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
	 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，
	 * 它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreatePrototype c = new ConcreatePrototype();
		for(int i=0;i<5;i++){
			ConcreatePrototype cp = (ConcreatePrototype) c.clone();
			cp.show();
		}
		
	}

}
