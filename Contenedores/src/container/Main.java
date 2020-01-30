package container;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Contenedor list = new Contenedor();//LO CREAMOS PARA HACER LA LLAMADA A LA CLASE (Contenedor)
		PRUEBAS prueba= new PRUEBAS();
		boolean salir = false;
		Scanner sn = new Scanner(System.in); // UN SCANNER PARA RECONOCER EL MUMERO DE LA LISTA DE DE OPCIONES QUE INSERTAMOS[SWITCH]
		int opcion;
		 while (!salir) { //PONEMOS ESTO PARA QUE RECONOZCA QUE (HASTA QUE NOSOTROS NO PONGAMOS [SALIR=TRUE] EL PROGRAMA NO FINALICE
			 
			 System.out.println("\nSelecciona una de las opciones:");
			 
	            System.out.println("1. Listas ");
	            System.out.println("2. Iterators/ACTUALMENTE PARA HACER PRUEBAS");
	            System.out.println("3. Cola");
	            System.out.println("4. Pilas");
	            System.out.println("5. Conjuntos");
	            System.out.println("6. Mapas");
	            System.out.println("7. Salir");
	 
	            opcion = sn.nextInt(); //LO CREAMOS PARA PEDIR EL NUMERO DE LA OPCION QUE QUEREMOS
	               
	                switch (opcion) {
	                    case 1:
	                        System.out.println("HAS SELECCIONADO LA OPCION 1. \n");
	                        list.Listas();
	                        break;
	                    case 2:
	                        System.out.println("HAS SELECCIONADO LA OPCION 2. \n");
	                        prueba.pruebas();
	                        break;
	                    case 3:
	                        System.out.println("HAS SELECCIONADO LA OPCION 3. \n");
	                       
	                        break;
	                    case 4:
	                        System.out.println("HAS SELECCIONADO LA OPCION 4. \n");
	                        
	                        break;
	                    case 5:
	                        System.out.println("HAS SELECCIONADO LA OPCION 5. \n");
	                        
	                        break;
	                    case 6:
	                        System.out.println("HAS SELECCIONADO LA OPCION 6. \n");
	                       
	                        break;
	                    case 7:
	                    	salir = true;//CON ESTA OPCION SALDREMOS DEL PROGRAMA
                    		break;
	
	     }
	    
		 }
		 
		 }
	
	
	}