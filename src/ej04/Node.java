package ej04;

public class Node<E> {
	private E element;
	private Node<E> next;
	
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}
	public Node(E e) {
		this(e,null);
	}
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
}
