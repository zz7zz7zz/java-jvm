package com.jvm;

/**
 * 虚拟机栈和本地方法栈OOM测试
 * 
 * VM Args : -Xss128K
 * 
 * @author Administrator
 *
 */
public class JavaVMStackSOF {

	private int stackLength = 1;
	
	public void stackLength(){
		stackLength++;
		stackLength();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try{
			oom.stackLength();
		}catch(Throwable e){
			System.out.println("stack length: " + oom.stackLength);
			throw e;
		}
	}

}

