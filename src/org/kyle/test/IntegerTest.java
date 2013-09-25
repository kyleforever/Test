package org.kyle.test;

public class IntegerTest {
	
	
	public static void add3(Integer i){
		int val = i.intValue();
		val += 3;
		i = new Integer(val);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(0);
		add3(i);
		System.out.println(i.intValue());
	}

}
