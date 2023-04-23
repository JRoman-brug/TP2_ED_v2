package ej02;

import java.util.Iterator;

import TDAPila.EmptyStackException;
import TDAPila.Stack;

public class PilaArreglo<E> implements Stack<E>{
	
	protected int size;
	protected E[] datos;
	
	public PilaArreglo(int max) {
		datos = (E[]) new Object[max];
	}
	public PilaArreglo() {
		this(20);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E top() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException("La cola esta vacia ");
		return datos[size-1];
	}
	
	public void push(E element) {
		
		//Si la pila esta llena aumento el tamanio
		if(size == datos.length) {
			E[] aux = (E[]) new Object[(datos.length*2)];
			for (int i = 0; i < datos.length; i++) {
				aux[i] = datos[i];
			}
			
			datos = aux;
		}
		datos[size] = element;
		size++;
	}
	
	public E pop() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException("");
		E aux = datos[size-1];
		datos[size-1] = null;
		size--;
		return aux;
	}
	
	
	
	//Ejecicio 3 
	//O(n)
	public <E2> void invertir(Stack<E2> p) {
		Stack<E2> aux1, aux2;
		
		aux1 = new PilaArreglo<E2>();
		aux2 = new PilaArreglo<E2>();
		
		transferir(p,aux1);
		transferir(aux1,aux2);
		transferir(aux2,p);
	}
	private <E2> void transferir(Stack<E2> pila1, Stack<E2> pila2) {
		int sizeAux = pila1.size();
		for (int i = 0; i < sizeAux; i++) {
			try {
				pila2.push(pila1.pop());
			}catch(EmptyStackException e) {
			}
		}
	}
	
	public void invertir() {
		E aux;
		for (int i = 0; i < (size-1)/ 2 ; i++) {
			System.out.println(i);
			aux = datos[i];
			datos[i] = datos[size-1-i];
			datos[size-1-i] = aux;
		}
	}
}