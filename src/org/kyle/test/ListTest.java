package org.kyle.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListTest {


	public static void main(String[] args) {
		int n = 0;
		Object[] a;
		Test test = new Test(n);
		List list = new ArrayList();
		List<Integer> li = new ArrayList<Integer>();
		List vector = new Vector();
		
		list.add(test.getNumber());
		list.add(test.getNumber());
		list.add(test.getNumber());
		
		li.add(01);
		li.add(02);
		li.add(03);
		li.add(04);
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		
		Iterator iterator = list.iterator();
		ListIterator listIterator = list.listIterator();
		Iterator<Integer> integerIterator = li.iterator();
		ListIterator<Integer> integerListIterator = li.listIterator();
		Iterator vectorIterator = vector.iterator();
		ListIterator vectorListIterator = vector.listIterator();
		
		/*for(Iterator iterator = list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}*/
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		/*for(listIterator; listIterator.hasPrevious();){
			System.out.println(listIterator.previous());
		}*/
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
		
		while(integerListIterator.hasNext()){
			System.out.println("aa:" + integerListIterator.next());
		}
		while(integerListIterator.hasPrevious()){
			System.out.println("bb:" + integerListIterator.previous());
		}
		while(integerIterator.hasNext()){
			System.out.println(integerIterator.next());
		}
		
		a = list.toArray();
		System.out.println(list.get(2));
		System.out.println(a[2]);
		
		while(vectorIterator.hasNext()){
			System.out.println("vector:"+ vectorIterator.next());
		}
		while(vectorListIterator.hasNext()){
			System.out.println("vector:" + vectorListIterator.next());
		}
		while(vectorListIterator.hasPrevious()){
			System.out.println("vector:" + vectorListIterator.previous());
		}
		
	}

}

class Test{
	int n;
	Test(int n){
		this.n = n;
	}
	
	public int getNumber(){
		return n++;
	}
}