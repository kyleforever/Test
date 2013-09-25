package org.kyle.dsa;

public class TreeLinkedList implements Tree{
	private Object element;
	private TreeLinkedList parent, firstChild, nextSbiling;
	
	public TreeLinkedList(){
		this(null, null, null, null);
	}
	
	public TreeLinkedList(Object e, TreeLinkedList p, TreeLinkedList c, TreeLinkedList s){
		element = e;
		parent = p;
		firstChild = c;
		nextSbiling = s;
	}
	@Override
	public Object getElement() {
		
		return element;
	}

	@Override
	public Object setElement(Object obj) {
		Object bak = element;
		element = obj;
		
		return bak;
	}

	@Override
	public TreeLinkedList getParent() {
		
		return parent;
	}

	@Override
	public TreeLinkedList getFirstChild() {
		
		return firstChild;
	}

	@Override
	public TreeLinkedList getNextSibling() {
		
		return nextSbiling;
	}

	@Override
	public int getSize() {
		int size = 1;
		TreeLinkedList subtree = firstChild;
		while(null != subtree){
			size +=subtree.getSize();
			subtree = subtree.getNextSibling();
		}
		return size;
	}

	@Override
	public int getHeight() {
		int height = -1;
		TreeLinkedList subtree = firstChild;
		while(null != subtree){
			height = Math.max(height, subtree.getHeight());
			subtree = subtree.getNextSibling();
		}
		return height;
	}

	@Override
	public int getDepth() {
		int depth = 0;
		TreeLinkedList p = parent;
		while(null != p){
			depth ++;
			p = p.getParent();
		}
		return depth;
	}
	
}
