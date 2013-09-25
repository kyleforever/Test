package org.kyle.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorTest {
	int input ;
	public int getInput(){
		
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		try {
			input =  Integer.parseInt(bis.readLine());
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorTest ot = new OperatorTest();
		int a = ot.getInput();
		System.out.println(a);
	}

}
