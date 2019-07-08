package com.jvm;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/**
 * Java堆内存异常测试
 * 
 * VM Args : -Xmx20M -XX:MaxDirectMemorySize=10M  -XX:+HeapDumpOnOutOfMemoryError
 * 说明：-Xms 堆最小值 -Xmx 堆最大值
 * @author Administrator
 *
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 * 1024;
	
	public static void main(String[] args) {
//		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
//		unsafeField.setAccessible(true);
//		Unsafe unsafe = (Unsafe)unsafeField.get(null);
//		while(true){
//			unsafe.allocateMemory(_1MB);
//		}
		
		while(true){
			ByteBuffer.allocate(10*_1MB);
		}
		
	}

}
