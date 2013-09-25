package org.kyle.test;

public class TryFinally {
	public static void main(String[] args){
		System.out.println(TryFinally.test());
	}
	
	static int test(){
		int x = 1;
		try{
			return x;
		}finally{
			++x;
		}
	}
}
