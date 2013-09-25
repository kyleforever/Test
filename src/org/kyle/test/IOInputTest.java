package org.kyle.test;

import java.io.*;

class InputData{
	static private String s ="";
	public static void input(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static public int getInt(){
		input();
		return Integer.parseInt(s);
	}
}

class Result{
	void print(int d){
		System.out.println("d*d:" + d*d);
		System.out.println("d*d*d:" + d*d*d);
	}
}
public class IOInputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Result result = new Result();
		System.out.println("Please input a number:");
		int a = InputData.getInt();
		result.print(a);
	}

}
