public class LinkedList{
	private Node cabecera;
	private Node tmp;
	
	//Constructor
	public LinkedList (){
		cabecera = new Node (-1);
	}

	public void insertarFinal (int dato){
		Node nuevoNodo;
		nuevoNodo = new Node (dato);

		//apuntamos a nulo
		nuevoNodo.establecerSiguiente(null);
		
		/*recorremos la lista posicionando
		tmp en cabecera para empezar*/
		tmp = cabecera;
		while (tmp.obtenerSiguiente() != null){
			tmp = tmp.obtenerSiguiente();
		}
		tmp.establecerSiguiente(nuevoNodo);
	}

	public void insertarInicio (int dato){
		Node nuevoNodo;
		nuevoNodo = new Node (dato);

		//donde estaba apuntando cabecera
		nuevoNodo.establecerSiguiente(cabecera.obtenerSiguiente());
		cabecera.establecerSiguiente (nuevoNodo);
	}

	public void insertarEntre (int dato, int numeroSiguiente){
		Node nuevoNodo;
		nuevoNodo = new Node (dato);
		
		boolean encontrado = false;
		
		tmp = cabecera;		

		while (tmp.obtenerSiguiente() != null){
			if (tmp.obtenerDato() == numeroSiguiente){
				encontrado = true;
				break;
			}
			tmp = tmp.obtenerSiguiente();	
		}	
		if (encontrado) {
			nuevoNodo.establecerSiguiente( tmp.obtenerSiguiente()  );
			tmp.establecerSiguiente( nuevoNodo );
		}	
	}
	
	public void rebobinar (){
		tmp = cabecera;
	}

	public boolean siguiente (){
		boolean esSiguiente = false;
		if (tmp.obtenerSiguiente() != null){
			tmp = tmp.obtenerSiguiente();
			esSiguiente = true;
		}
		return esSiguiente;
	}

	public int obtener(){
		if (tmp == cabecera){
			tmp = cabecera.obtenerSiguiente();
		}
		if (tmp == null){
			return 0;
		}
		return tmp.obtenerDato();
	}
	
	public boolean Buscar(int numero)  {
		tmp = cabecera;

		while (tmp.obtenerSiguiente() != null) {
			tmp = tmp.obtenerSiguiente();
			if (tmp.obtenerDato() == numero) {
				return true;
			}
		}
		return false;
	}
	
	public void eliminar(int numero)  {
		tmp = cabecera;
		Node toDelete;

		if (tmp.obtenerSiguiente() != null){	
			while (tmp.obtenerSiguiente() != null) {
				if (tmp.obtenerSiguiente().obtenerDato() == numero){
					toDelete = tmp.obtenerSiguiente();
					tmp.establecerSiguiente (toDelete.obtenerSiguiente());
					toDelete = null;
					break;
				}
				tmp = tmp.obtenerSiguiente();
			}
		}
	}
}
