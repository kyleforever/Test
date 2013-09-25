package org.kyle.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTempTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String pathname = "test.txt";
		String teststring = "this is a test";
		try {
			write(pathname, teststring);
			System.out.println("write is ok");
			read(pathname);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void write(String pathname, String content) throws FileNotFoundException,
			IOException {
		File f = new File(pathname);
		FileOutputStream fo = new FileOutputStream(f);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
		bw.write(content);
		bw.close();
	}
	
	public static void read(String pathname) throws FileNotFoundException,
			IOException{
		File f = new File(pathname);
		FileInputStream fi = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(fi));
		System.out.println(br.readLine());
		br.close();
	}

}


