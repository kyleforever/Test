package org.kyle.test;

public class BooleanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String foo = "blue";
		boolean[] bar = new boolean[1];
		if(bar[0]){
			foo = "green";
		}
		
		System.out.println(bar[0]);
		System.out.println(foo);
		
	}

}
