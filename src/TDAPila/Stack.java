package TDAPila;

public interface Stack<E> {
	

	/**
	 * Consulta la cantidad de elementos de lapila
	 * @return Cantidad de elementos de la pila
	 */
	public int size();
	
	
	/**
	 * Verifica si la pila esta vacia
	 * @return true si la pila esta vacia y false si la pila NO esta vacia     
	 */
	public boolean isEmpty();
	
	
	/**
	 * Consulta el ultimo elemento de la pila
	 * @return el ultimo elemento de la pila
	 * @throws EmptyStackExeption si la pila esta vacia 
	 */
	public E top() throws EmptyStackException;
	
	
	/**
	 * Inserta un elemento al tope de la pila
	 * @param element Elemento a insertar
	 */
	public void push(E element);
	
	/**
	 * Remueve el elemento que se encuentra en el tope de la pila
	 * @return El elemento removido
	 * @throws EmptyStackException si la pila esta vacia
	 */
	public E pop() throws EmptyStackException;
}
