package org.kyle.dsa.test;

import org.kyle.dsa.TreeLinkedList;

public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeLinkedList tree = new TreeLinkedList();
		
		for (int i = 0; i < 10; i++) {
			tree.setElement(new Integer(i));
		}
		System.out.println(tree.getHeight());

	}

}
