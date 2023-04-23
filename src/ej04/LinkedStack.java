package ej04;

import TDAPila.EmptyStackException;
import TDAPila.Stack;
import ej02.PilaArreglo;

public class LinkedStack<E> implements Stack<E>{
	private Node<E> head;
	private int size;
	
	public LinkedStack() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public E top() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException("Pila vacia");
		return head.getElement();
	}
	public void push(E element) {
		Node<E> aux = new Node<E>(element,head);
		head = aux;
		size++;
	}
	public E pop() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException("Pila Vacia");
		E aux = head.getElement();
		head = head.getNext();
		size--;
		return aux;
	}
	
	public void invertir(Stack<E> p) {
		Stack<E> aux1, aux2;
		try {
			System.out.println(p.top());
		}catch(Exception e) {
			
		}
		aux1 = new LinkedStack<E>();
		aux2 = new LinkedStack<E>();
		
		transferir(p,aux1);
		transferir(aux1,aux2);
		transferir(aux2,p);
	}
	private void transferir(Stack<E> pila1, Stack<E> pila2) {
		int sizeAux = pila1.size();
		for (int i = 0; i < sizeAux; i++) {
			try {
				pila2.push(pila1.pop());
			}catch(EmptyStackException e) {
			}
		}
	}
	
}
