import java.util.*;

public class ListProgram {
	public static void main (String [] args){
		LinkedList ll;
		Scanner teclado;
		int numero;
		int eleccion;
		
		teclado = new Scanner(System.in);
		ll = new LinkedList();

		do{
		System.out.println ("Linked List Program\n");
		
		System.out.println ("1.- Agregar datos al inicio.\n");
		System.out.println ("2.- Agregar datos al final.\n");
		System.out.println ("3.- Agregar datos entre la lista.\n");
		System.out.println ("4.- Borrar datos de la lista.\n");
		System.out.println ("5.- Buscar un numero.\n");
		System.out.println ("6.- Salir.\n");
		
		eleccion = teclado.nextInt();
		
		switch (eleccion){
			case 1:
				System.out.print ("Ingrese el numero que quiera guardar (presione 0 para salir: \n");
				
				do{
					System.out.print ("Tipo: ");
					numero = teclado.nextInt();
					if (numero != 0){
						ll.insertarInicio(numero);
					}
				}while (numero != 0);
				
				System.out.println ("\n**********");
				System.out.print ("La lista es: ");

				ll.rebobinar();

				while(ll.siguiente()){
					System.out.print (ll.obtener() + ", ");
				}
				System.out.println ("\n");
				break;
			case 2:
				System.out.print ("Ingrese el numero que quiera guardar (presione 0 para salir: \n");
				
				//Aqui ingresamos el numero y nos fijamos si es distinto a 0, si es distinto entonces inserta el nodo al principio
				do{
					System.out.print ("Tipo: ");
					numero = teclado.nextInt();
					if (numero != 0){
						ll.insertarInicio(numero);
					}
				}while (numero != 0);
				
				System.out.println ("\n**********");
				System.out.print ("La lista es: ");
				//regresamos a header
				ll.rebobinar();
				//recorremos la lista para imprimirla en pantalla
				while(ll.siguiente()){
					System.out.print (ll.obtener() + ", ");
				}
				System.out.println ("\n");
				break;
			case 3:
				//capturamos los datos
				System.out.print ("Ingrese el numero que quiera guardar (presione 0 para salir: \n");
				System.out.print ("Tipo: ");
				numero = teclado.nextInt();
				System.out.print ("ingrese la posicion donde se metera el dato: ");
				int posicion = teclado.nextInt();
				
				//si el numero es distinto a 0 inserta el nodo en la posicion pedida
				if (numero != 0){
					ll.insertarEntre(numero, posicion);
				}
				System.out.println ("\n**********");
				System.out.print ("La lista es: ");
				//regresamos a header
				ll.rebobinar();
				//recorremos la lista para imprimirla en pantalla
				while(ll.siguiente()){
					System.out.print (ll.obtener() + ", ");
				}
				System.out.println ("\n");
				break;
			case 4:
				System.out.print ("Ingresa el numero que quieres borrar: ");
				int numeroEliminar = teclado.nextInt();
				
				//este metodo regresara a header
				ll.rebobinar();
				//este metodo ya incluye la busqueda, asi que solo le pasamos como parametro el numero a eliminar
				ll.eliminar (numeroEliminar);
				
				//volvemos a regresarnos a header
				ll.rebobinar();
				
				System.out.print ("La lista es: ");
				//Recorremos la lista para imprimirla en pantalla
				while(ll.siguiente()){
					System.out.print (ll.obtener() + ", ");
				}
				System.out.println ("\n");
				break;
			case 5:
				System.out.print ("Ingresa el numero que quieras buscar: \n");
				int numeroBuscar = teclado.nextInt();
				Node buscar;
				
				//regresamos a header
				ll.rebobinar();
				
				/*le pasamos el numero ingresado como parametro al metodo buscar y con una estructura selectiva
				 * imprimimos en la pantalla si fue encontrado el numero o no */
				if (ll.Buscar(numeroBuscar)){
					System.out.println ("El numero " + numeroBuscar + " si se encuentra en la lista\n");
				}else{
					System.out.println ("El numero " + numeroBuscar + " no se encuentra en la lista\n");
				}
			}
		}while (eleccion != 6);
	}
}
