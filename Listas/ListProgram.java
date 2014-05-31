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
			case 3:
				System.out.print ("Ingrese el numero que quiera guardar (presione 0 para salir: \n");
				System.out.print ("Tipo: ");
				numero = teclado.nextInt();
				System.out.print ("ingrese la posicion donde se metera el dato: ");
				int posicion = teclado.nextInt();
				
				if (numero != 0){
					ll.insertarEntre(numero, posicion);
				}
				System.out.println ("\n**********");
				System.out.print ("La lista es: ");

				ll.rebobinar();

				while(ll.siguiente()){
					System.out.print (ll.obtener() + ", ");
				}
				System.out.println ("\n");
				break;
			case 4:
				System.out.print ("Ingresa el numero que quieres borrar: ");
				int numeroEliminar = teclado.nextInt();
				
				ll.rebobinar();
				ll.eliminar (numeroEliminar);
				
				ll.rebobinar();
				
				System.out.print ("La lista es: ");

				while(ll.siguiente()){
					System.out.print (ll.obtener() + ", ");
				}
				System.out.println ("\n");
				break;
			case 5:
				System.out.print ("Ingresa el numero que quieras buscar: \n");
				int numeroBuscar = teclado.nextInt();
				Node buscar;
				
				ll.rebobinar();
				
				if (ll.Buscar(numeroBuscar)){
					System.out.println ("El numero " + numeroBuscar + " si se encuentra en la lista\n");
				}else{
					System.out.println ("El numero " + numeroBuscar + " no se encuentra en la lista\n");
				}
			}
		}while (eleccion != 6);
	}
}
