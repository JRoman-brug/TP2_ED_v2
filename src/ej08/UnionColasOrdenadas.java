package ej08;

import java.util.Iterator;

import TDACola.EmptyQueueException;
import TDACola.Queue;
import TDAPila.EmptyStackException;
import TDAPila.Stack;
import ej06_2.LinkedQueue;

public class UnionColasOrdenadas {
	private Queue<Stack<Character>> cin1,cin2;
	private char indice;
	
	public UnionColasOrdenadas(Queue<Stack<Character>> c1, Queue<Stack<Character>> c2) {
		cin1 = c1;
		cin2 = c2;
		indice = 'a';
	}
	
	public Queue<Character> unionQueue(){
		Queue<Character> aux = new LinkedQueue<Character>();
		
//		try {

			transferirStackQueue(cin1, aux);
//			int sizeQueue = cin1.size();
//			Stack<Character> stackAux = null;
//			
//			for (int i = 0; i < sizeQueue; i++) {
//				stackAux = cin1.dequeue();
//				int sizeStack = stackAux.size();
//				
//				for (int j = 0; j < sizeStack; j++) {
//					aux.enqueue(stackAux.pop());
//				}
//			}
			transferirStackQueue(cin2, aux);
//			sizeQueue = cin2.size();
//			for (int i = 0; i < sizeQueue; i++) {
//				stackAux = cin2.dequeue();
//				int sizeStack = stackAux.size();
//				
//				for (int j = 0; j < sizeStack; j++) {
//					aux.enqueue(stackAux.pop());
//				}
//			}
			
//		}catch(EmptyStackException | EmptyQueueException e) {
//			System.err.println(e.getMessage());
//		}
//		
		return aux;
	}
	private void transferirStackQueue(Queue<Stack<Character>> q1, Queue<Character> result) {
		try {
			int sizeQueue = q1.size();
			Stack<Character> stackAux = null;
			
			for (int i = 0; i < sizeQueue; i++) {
				stackAux = q1.dequeue();
				int sizeStack = stackAux.size();
				
				for (int j = 0; j < sizeStack; j++) {

					System.out.println(stackAux.top());
					result.enqueue(stackAux.pop());
				}
			}
		}catch(EmptyStackException | EmptyQueueException e) {
			System.err.println(e.getMessage());
		}
	}
}
