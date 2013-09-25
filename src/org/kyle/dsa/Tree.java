package org.kyle.dsa;

public interface Tree {
	public Object getElement();
	public Object setElement(Object obj);
	public TreeLinkedList getParent();
	public TreeLinkedList getFirstChild();
	public TreeLinkedList getNextSibling();
	public int getSize();
	public int getHeight();
	public int getDepth();
	
}
