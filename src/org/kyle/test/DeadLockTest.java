package org.kyle.test;


class MyRunnable implements Runnable{
	
	private boolean flag = true;
	
	MyRunnable(boolean flag){
		this.flag = flag;
	}

	@Override
	public void run() {
		if(flag){
			synchronized (MyObject.a) {
				System.out.println("if lock a");
				synchronized (MyObject.b) {
					System.out.println("if lock b");
				}
			}
		}else{
			synchronized (MyObject.b) {
				System.out.println("else lock b");
				synchronized (MyObject.a) {
					System.out.println("else lock a");
				}
			}
		}
	}
}

class MyObject{
	static Object a = new Object();
	static Object b = new Object();
}
public class DeadLockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable mr1 = new MyRunnable(true);
		MyRunnable mr2 = new MyRunnable(false);
		
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		
		t1.start();
		t2.start();
	}

}
