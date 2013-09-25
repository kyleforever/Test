package org.kyle.test;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueJosephus {
	public static Object josephus(Queue q, int k){
		if(q.isEmpty())
			return null;
		while(q.size() > 1){
			/*Iterator iterator = q.iterator();
			if(iterator.hasNext()){
				System.out.println(iterator.next());
			}*/
			for(int i = 0; i < k; i++)
				q.add(q.remove());
			Object e = q.remove();
			System.out.println("\n\t" + e + "quite");
		}
		
		return q.remove();
	}
	
	public static Queue buildQueue(Object a[]){
		Queue q = new ArrayDeque(20);
		for(int i = 0; i < a.length; i++)
			q.add(a[i]);
		return q;
	}
	public static void main(String[] args) {
		String[] kid = {"lilong", "kylelee","sunny","lingguiqing",
						"gaoshujuan","yuanhong","yangzaimo","youtao",
						"xiexiaoli","wangxiaowei"};
		System.out.println("The lucky kid is:" + josephus(buildQueue(kid), 2));
	}

}
