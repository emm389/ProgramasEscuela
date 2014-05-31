public class Node{
	private Node siguiente;
	private int dato;
	
	public Node (int d){
		dato = d;
		siguiente = null;
	}
	
	public Node obtenerSiguiente (){
		return siguiente;
	}
	
	public int obtenerDato (){
		return dato;
	}
	
	public void establecerSiguiente (Node n){
		siguiente = n;
	}
	
	public int establecerDato (){
		return dato;
	}
}
