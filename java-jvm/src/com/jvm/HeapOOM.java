package com.jvm;


import java.util.ArrayList;
import java.util.List;

/**
 * Java堆内存异常测试
 * 
 * VM Args : -Xms20M -Xmx20M  -XX:+HeapDumpOnOutOfMemoryError
 * 说明：-Xms 堆最小值 -Xmx 堆最大值
 * @author Administrator
 *
 */
public class HeapOOM {
	
//------------------------- 测试一 ----------------------------
//	static class OOMObject{
//		
//	}
//	
//	public static void main(String[] args){
//		
//		List<OOMObject> list = new ArrayList<OOMObject>();
//		while(true){
//			list.add(new OOMObject());
//		}
//	
//	}
	
	//------------------------- 测试二 ----------------------------
	public static final int _1MB = 1024 * 1024;
	static class OOMObject2{
		public byte[] array = new byte[_1MB];
	}
	
	public static void main(String[] args){
		try{
			System.out.println(" start -----" );
			List<OOMObject2> list = new ArrayList<OOMObject2>();
			for (int i = 1; i < 100000; i++) {
				System.out.println("add index " + i);
				list.add(new OOMObject2());
			}
			System.out.println(" end -----" );
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
