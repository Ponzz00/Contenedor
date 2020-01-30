package container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Contenedor {
	
	public static void Listas() {
		
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//LISTA Nº1
			ArrayList<Integer> Lista1 = new ArrayList <Integer>(); //CREAMOS ARRAY PARA IR ALMACENAND LOS NUMEROS
			Scanner num =new Scanner(System.in);//CREAMOS EL SCANNER PARA LEER LOS NUMEROS POR TECLADO
			Scanner num1 =new Scanner(System.in);//CREAMOS EL SCANNER PARA LEER LOS NUMEROS POR TECLADO
			int n = 0;//CREAMOS EL VALOR N PARA INTRODUCIR UN NUMERO EL CUAL, VA A LEER EL SCANNER 
			int limite=0; //DECLARAMOS ESTE ELEMENTO PARA ESPECIFICAR EL LIMITE DE (3)
			System.out.print("ATENCION, SIGA LOS PASOS ESTIPULADOS ESTRICTAMENTE USANDO EL ARCHIVO [README] "
					+ "\nDE LO CONTRARIO SI INTRODUCE UN VALOR DIFERENTE AL INDICADO SE REINICIARA EL PROGRAMA:\n");	
			
			//CREAR LISTA1
			System.out.print("\n[Introduce los 3 numeros para la Lista1]:\n");
			while (limite<3) { //CREAMOS UN WHILE PARA PONER EL LIMITE DE LOS 3 NUMEROS
				limite=limite +1;// PONIENDO ESTO CADA VEZ QUE INSERTEMOS UN NUMERO EL LIMITE(CONTADOR) SE IRA INCREMENTANDO +1 HASTA LLEGAR A 3 Y ASI EL WHILE SE DETENDRA.
				n=num.nextInt();
				Lista1.add(n);//AQUI INSERTAREMOS Y ALMACENAREMOS LOS NUMEROS INTRODUCIDOS DENTRO DEL ARRAYLIST 
				}
				System.out.print("Los Valores actuales del Array Lista1 son:" +Lista1+"\n");//LO PONEMOS FUERA PARA QUE IMPRIMA EL RESULTADO AL ACABAR EL BUCLE(WHILE) Y SALTE A ÉSTA LINEA.
			
					//ELIMINAR VALOR DE LA 2ª POSICION
				System.out.print("[PULSA 2 PARA ELIMINAR EL SEGUNDO VALOR]\n");// CREAMOS LA BARRA INVERTIDA+N (\n) PARA HACER SALTOS DE LINEA CON EL COMANDO [ALT+92]
				n=num1.nextInt();
		
				if(n==2) {
					Lista1.remove(1);//AQUI ELIMINAMOS EL VALOR DE LA 2ª POSICION ES DECIR EL VALOR[1] DEL ARRAY YA QUE SE EMPIEZA SIEMPRE DESDE 0.
					System.out.print("Los Valores ahora del Array son:" +Lista1+"\n");}
				else {
					System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
					System.out.print("EL PROGRAMA SE HA REINICIADO\n");
					return;
					}
		
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//LISTA Nº2	
			ArrayList<Integer> Lista2 = new ArrayList <Integer>();
			Scanner num2 =new Scanner(System.in);//CREAMOS EL SCANNER PARA LEER LOS NUMEROS POR TECLADO
			Scanner num3 =new Scanner(System.in);//CREAMOS EL SCANNER PARA LEER LOS NUMEROS POR TECLADO
			int n2 = 0;//CREAMOS EL VALOR N PARA INTRODUCIR UN NUMERO EL CUAL, VA A LEER EL SCANNER 
			int limite2=0; //DECLARAMOS ESTE ELEMENTO PARA ESPECIFICAR EL LIMITE DE (3)
					
					//CREAR LISTA2
			System.out.print("\n[Introduce los 3 numeros para la Lista2]:\n");
			while (limite2<3) { //CREAMOS UN WHILE PARA PONER EL LIMITE DE LOS 3 NUMEROS
				
				limite2=limite2 +1;// PONIENDO ESTO CADA VEZ QUE INSERTEMOS UN NUMERO EL LIMITE(CONTADOR) SE IRA INCREMENTANDO +1 HASTA LLEGAR A 3 Y ASI EL WHILE SE DETENDRA.
				n2=num2.nextInt();
				Lista2.add(n2);//AQUI INSERTAREMOS Y ALMACENAREMOS LOS NUMEROS INTRODUCIDOS DENTRO DEL ARRAYLIST 
				}
			System.out.print("Los Valores actuales del Array Lista2 son:" +Lista2+"\n");
		
		
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	//COMBINAR LISTAS
			System.out.print("\n[PULSA 1 PARA COMBINAR Lista1 Y Lista2]\n");// CREAMOS LA BARRA INVERTIDA+N (\n) PARA HACER SALTOS DE LINEA CON EL COMANDO [ALT+92]
			n2=num3.nextInt();
			
				if(n2==1) {
					ArrayList<Integer> Lista3=new ArrayList<Integer>();//CREAMOS NUEVA LISTA DONDE COMBINAR LAS OTRAS 2
					Lista3.addAll(Lista1);
					Lista3.addAll(Lista2);
					
					System.out.print("Los Valores de la combinacion de Lista1 y Lista2 son:" +Lista3+"\n");
					}
				else {
					System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
					System.out.print("EL PROGRAMA SE HA REINICIADO\n");
					return;
					}
		
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//ELIMINAR TODOS LOS VALORES DE LA LISTA1
				System.out.print("[PULSA 2 PARA ELIMINAR TODOS LOS VALORES DE LA Lista1]\n");// CREAMOS LA BARRA INVERTIDA+N (\n) PARA HACER SALTOS DE LINEA CON EL COMANDO [ALT+92]
				n=num1.nextInt();
				
				if(n==2) {
					Lista1.clear();//AQUI ELIMINAMOS EL VALOR DE LA 2ª POSICION ES DECIR EL VALOR[1] DEL ARRAY YA QUE SE EMPIEZA SIEMPRE DESDE 0.
					System.out.print("Se eliminaron todos los valores de la Lista 1:" +Lista1+"\n");}
				else {
					System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
					System.out.print("EL PROGRAMA SE HA REINICIADO\n");
					return;
					}
	//-------------------------------------------------------------------------------------------------------------------------
	//AÑADIR LOS VALORES DE LA Lista2 A LA Lista1
				System.out.print("[PULSA 3 PARA AÑADIR LOS VALORES DE Lista2 A Lista1]\n");
				n=num1.nextInt();
				
				if (n==3) {
				Lista1.addAll(Lista2);
				System.out.print("Se añadieron todos los valores de la Lista2 a Lista1\n");
				System.out.print("Lista1: "+Lista1);
				}
				else {
					System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
					System.out.print("EL PROGRAMA SE HA REINICIADO\n");
					return;
					}
				
	//-------------------------------------------------------------------------------------------------------------------------------------
	//COMPROBAR QUE DENTRO DE Lista1 ESTA EL VALOR 6
				System.out.print("\n[PULSA UNA TECLA PARA COMPROBAR SI EN LA Lista1 ESTA EL VALOR 6]\n");
				n=num1.nextInt();
				
					if(Lista1.contains(6)) {
					System.out.print("EL VALOR 6 ESTA EN LA Lista1: " +Lista1+ "\n");
					}
					else {
					System.out.print("EL VALOR 6 (NO) ESTA EN LA Lista1\n");
					//AÑADIR EL VALOR 6 EN LA Lista1 EN LA PRIMERA POSICION == 0
					System.out.print("PULSA 1 PARA AÑADIR EL VALOR 6 A Lista1\n");
					n=num1.nextInt();
				
					if (n==1) { 
						Lista1.add(1,6);
						System.out.print("\nEL VALOR (6) SE HA AÑADIDO AL INICIO DE Lista1:" +Lista1);}
					else {
						System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
						System.out.print("EL PROGRAMA SE HA REINICIADO\n");
						return;
						}
					}
	//---------------------------------------------------------------------------------------------------
	//BUSCA LA POSICION DEL VALOR (9) EN LA Lista1
				System.out.print("\n[TECLEE UN NUMERO(1-3)-+ PARA COMPROBAR SI EN LA Lista1 ESTA EL VALOR 9]\n");
				n=num1.nextInt();
					
					if(Lista1.contains(9)) {
						System.out.print("EL VALOR 9 ESTA EN LA Lista1" +Lista1+ "\n");
						}
						else {
						System.out.print("EL VALOR 9 (NO) ESTA EN LA Lista1\n");
						//AÑADIR EL VALOR 6 EN LA Lista1 EN LA PRIMERA POSICION == 0
						System.out.print("PULSA 1 PARA AÑADIR EL VALOR 9 A Lista1\n");
						n=num1.nextInt();
							if (n==1) { 
								Lista1.add(2,9);
								System.out.print("\nEL VALOR (9) SE HA AÑADIDO AL INICIO DE Lista1:" +Lista1);}
							else {
								System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE\n");
								System.out.print("EL PROGRAMA SE HA REINICIADO\n");
								return;
								}
				}
				
		//---------------------------------------------------------------------------------------------------
		//EN Lista1, SUSTITUYE EL VALOR QUE ESTE EN LA POSICION [1] POR UN VALOR 5
				System.out.print("\n[PULSA 2 PARA SUSTITUIR EL VALOR EN SEGUNDO LUGAR POR UN NUEVO VALOR = 5]\n");
				n=num1.nextInt();
				
					if (n==2) { 
						Lista1.set(1,5);
						System.out.print("\nEL VALOR (5) SE HA AÑADIDO EN SEGUNDO LUGAR DE Lista1:" +Lista1);}
					else {
						System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
						System.out.print("EL PROGRAMA SE HA REINICIADO\n");
						return;
						}
		//---------------------------------------------------------------------------------------------------
		//EN Lista1, AÑADE EL VALOR 4 A LA POSICION [2] 		
				System.out.print("\nPULSA 1 PARA AÑADIR EL VALOR 4 EN LA POSICION [2] A Lista1\n");
				n=num1.nextInt();
					if (n==1) { 
						Lista1.add(2,4);
						System.out.print("\nEL VALOR (4) SE HA AÑADIDO EN EL TERCER LUGAR DE Lista1"
								+ "\nY LOS VALORES SE HAN MOVIDO UNA POSICION POSTERIOR A PARTIR DE CUYA POSICION"
								+"\nLista1:"+Lista1+"\n");
						}
					else {
						System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE\n");
						System.out.print("EL PROGRAMA SE HA REINICIADO\n");
						return;
						}	
					
		//---------------------------------------------------------------------------------------------------
		//CONVERTIR Lista1 EN UN ARRAY 
					System.out.print("\nPULSA 1 PARA CONVERTIR LA LISTA(Lista1) EN UN ARRAY(Array1)\n");
					n=num1.nextInt();
						if (n==1) { 
							Integer[] Array1 = new Integer[Lista1.size()];//CREAMOS EL ARRAY LLAMANDO DENTRO DE LOS [] EL METODO Lista1.size() PARA SABER Y PODER ASIGNAR EL TAMAÑO DE Lista1
							Array1 = Lista1.toArray(Array1);			  //ESCRIBIMOS Integer EN VEZ DE int(TIPO PRIMITIVO) PORQUE EN UNA ArrayList LOS TIPOS PRIMITIVOS NO EXISTEN)
							System.out.print("YA SEA HA TRANSFORMADO Lista1 A UN ARRAY LLAMADO Array1:\n");
							
							System.out.println("VALORES DEL ARRAY:");
							System.out.println(Arrays.asList(Array1)); //USAMOS ESTE METODO PARA PODER EXPRESARLO EN FORMATO LISTA EN VEZ DE POR COLUMNA Y ADEMAS EVITAR METODO FOR
					
						}
						else {
							System.out.print("NO HA DIGITADO EL VALOR CORRESPONDIENTE \n");
							System.out.print("EL PROGRAMA SE HA REINICIADO\n");
							return;
							}
		//---------------------------------------------------------------------------------------------------	
			
	}	
		}


























