package org.kyle.test;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DynProxyTest {
	
	public static DynProxy newHeavyMethod(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(DynProxy.class);
		enhancer.setCallback(new CglibHeavyMethodInterceptor());
		
		DynProxy cglibProxy = (DynProxy)enhancer.create();
		
		return cglibProxy;
	}
	public static void main(String args[]){
		DynProxy dp = newHeavyMethod();
		
		for(int i = 0; i < 100; i++)
			dp.heavyMethod(214748);
	}
}


class DynProxy{
	
	public String heavyMethod(int num){
		StringBuffer sb = new StringBuffer();
		
		return sb.toString();
	}
}

class CglibHeavyMethodInterceptor implements MethodInterceptor{
	
	DynProxy real = new DynProxy();
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		String v = real.heavyMethod((Integer)arg2[0]);
		return v;
	}
	
	
}