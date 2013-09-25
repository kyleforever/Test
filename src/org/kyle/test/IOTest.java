package org.kyle.test;

import java.io.*;
import java.io.ObjectInputStream.GetField;

public class IOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("test.txt");
			out.write("this is a test ¿Ó¡˙".getBytes());
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
