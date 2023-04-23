package ej09;

import java.util.Iterator;

import TDAPila.EmptyStackException;
import TDAPila.Stack;
import ej02.PilaArreglo;
import ej04.LinkedStack;

public class Ej9 {
	public Ej9() {
		
	}
	
	public Stack<Integer> ppeToPe(Stack<Stack<Integer>> ppe){
		//Invertidor
		Stack<Integer> invertir= new PilaArreglo<Integer>();
		
		Stack<Integer> output = new LinkedStack<Integer>();
		
		((PilaArreglo<Integer>)invertir).invertir(ppe);
		
		int sizeAux = ppe.size();
		for (int i = 0; i < sizeAux; i++) {
			try {
				Stack<Integer> auxStack = ppe.pop(); 
				int sizeAuxStack = auxStack.size();
				
				((PilaArreglo<Integer>)invertir).invertir(auxStack);
				
				for (int j = 0; j < sizeAuxStack; j++) {
					output.push(auxStack.pop());
				}
			}catch(EmptyStackException e) {
				
			}
		}
		
		return output;
	}
	
}
