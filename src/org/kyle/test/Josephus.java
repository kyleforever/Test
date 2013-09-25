package org.kyle.test;

import java.util.Scanner;

public class Josephus {

	
	public static void main(String[] args) {
		System.out.println("please input a total number");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println("please input a number which will be del");
		int n = scanner.nextInt();
		
		int[] a = new int[m];
		
		int len = m;
		for(int i = 0; i < a.length; i++)
			a[i] = i + 1;
		
		int i = 0;
		int j = 1;
		while(len > 0){
			if(a[i%m] > 0){
				if(j%n == 0){
					System.out.println(a[i%m] + " ");
					a[i%m] = -1;
					i++;
					j = 1;
					len--;
				}
				else{
					i++;
					j++;
				}
			}
			else{
				i++;
			}
		}
		
	}

}
