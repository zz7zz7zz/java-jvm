package com.jvm;

/**
 * 方法区内存溢出异常测试
 * 
 * VM Args : -XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * @author Administrator
 *
 */
public class JavaMethodAreaOOM {

	public static void main(String[] args) {
		while(true){
//			Enhancer enhancer = new Enhancer();
//			enhancer.setSuperclass(OOMObject.class);
//			enhancer.setUserCache(false);
//			enhancer.setCallback(new MethodInterceptor(){
//				public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable{
//					return proxy.invokeSuper(obj, args);
//				}
//			});
//			enhancer.create();
		}
	}

	static class OOMObject{
		
	}
}
