package ej07;

import java.util.Iterator;

import TDACola.EmptyQueueException;
import TDACola.Queue;
import TDAPila.EmptyStackException;
import TDAPila.Stack;
import ej02.PilaArreglo;
import ej04.LinkedStack;

public class ColaConPila<E> implements Queue<E>{
	
	protected Stack<E> datos;
	protected int size;
	protected E head;
	
	public ColaConPila() {
		datos = new PilaArreglo<E>();
		size=0;
		head = null;
	}
	
	public int size() {
		return datos.size();
	}
	
	public boolean isEmpty(){
		return datos.isEmpty();
	}
	
	public E front() throws EmptyQueueException{
		if(isEmpty()) throw new EmptyQueueException("Cola vacia");
		return head;
	}
	
	public void enqueue(E element) {
		if(isEmpty()) {
			head = element;
		}
		datos.push(element);
		
	}
	public E dequeue() throws EmptyQueueException{
		if(isEmpty()) throw new EmptyQueueException("Cola vacia");
		
		Stack<E> aux = new LinkedStack<E>();
		E elementAux = null;
		transferir(datos,aux);
		
		try {
			elementAux = aux.pop();
			head = aux.top();
		}catch(EmptyStackException e) {
			System.out.println(e.getMessage()+" asd ");
		}
		
		transferir(aux,datos);
		
		return elementAux;
	}
	
	private void transferir(Stack<E> p1, Stack<E> p2){
		int tamanio = p1.size();
		for (int i = 0; i < tamanio; i++) {
			try{
				p2.push(p1.pop());
			}catch(EmptyStackException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
