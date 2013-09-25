package org.kyle.test;

public class SplitChar {

	public static void split(String source, int num) throws Exception{
		
		int k = 0;
		String temp = "";
		for(int i = 0; i < source.length(); i++){
			byte[] b = (source.charAt(i) + "").getBytes();
			k = k + b.length;
			if(k > num){
				break;
			}
			
			temp = temp + source.charAt(i);
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "ÀîÁúabcËÄ´¨";
		int num = 10;
		
		System.out.println(source.length());
		System.out.println((source.charAt(4) + "").getBytes());
		try {
			SplitChar.split(source, num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
