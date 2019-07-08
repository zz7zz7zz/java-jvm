package com.jvm;

/**
 * 创建线程导致OOM测试
 * 
 * VM Args : -Xss2M
 * 
 * @author Administrator
 *
 */
public class JavaVMStackOOM {
	
	int threadCount = 0;
	
	public void donotstop(){
		while(true){
			
		}
	}
	
	public void stackLeakByThread(){

		while(true){
			Thread thread = new Thread(new Runnable(){

				@Override
				public void run() {
					donotstop();
				}
				
			});
			thread.start();
			threadCount++;
		}
	}
	
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		
		try{
			oom.stackLeakByThread();
		}catch(Throwable e){
			System.out.println("threadCount : " + oom.threadCount);
			throw e;
		}

	}

}

