package org.kyle.test;

public class GetFactorTest {

	public void getFactor(int n){
		for(int i = 2; i <= n/2 ; i++){
			if(n%i == 0){
				System.out.print(i + "*");
				getFactor(n/i);
			}
			
		}
		System.out.print(n);
		System.exit(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetFactorTest getFactorTest = new GetFactorTest();
		getFactorTest.getFactor(10000);
	}

}
