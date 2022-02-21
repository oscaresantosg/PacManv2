package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.pacman;

public class mainApp {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nevera = new Scanner(System.in);
	    boolean salir = false;
	    int opcion;

	    while (!salir || !nevera.hasNextInt()) {
	    	
	    	System.out.println("bienvenido a PACMAN     ***\n"
	    			+ "_______________________________________\n"
	    			+ "_______________________________________");
	        System.out.println("1.iniciar");
	        System.out.println("2.instrucciones 2");
	        System.out.println("3. Salir");

	        try {

	            System.out.println("seleccione una opcion ");
	            opcion = nevera.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Seleccionaste la opción 1");
	                    
	                    System.out.println("\r\n bienvenido al juegoo		-┘");
	                    
	                    pacman.main(args);
	                    System.out.println("..\n");
	                    System.out.println("*************************************");
	                    break;

	                case 2:
	                    System.out.println("Seleccionaste la opción 2");
	                    
	                    System.out.println(" ================================================"
	                    		+ " ´´´´´´´´´´´´  \n"
	                    		+ ""  
	                    		+ ""
	                    		+ ""
	                    		+ ""
	                    		+ ""
	                    		+ ""
	                    		+ ""
	                    		+ "");
	                    		
	                    
	                    System.out.println("l´´´´´´´´´´´´´´´´´´´´´´´´l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.-..-l");
	                    System.out.println("l-.-.-.-.-.-.-.-.-.-.--.-l");
	                    System.out.println("l.-.-.-.-.-.-.-.-.-.-...-l");
	                    System.out.println("l________________________l");
	                    
	                    
	                    
	                    
	                    break;

	                case 3:
	                    System.out.println("desea salir?...");
	                    System.out.println("ingrese 3");
	                    salir = true;
	                    //sc.close(); IllegalStateException: Scanner closed
	                    break;

	                default:
	                    System.out.println("Solo  números entre 1 y 3");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("¡Error!... Debes insertar un número");
	            nevera.next();
	        }
	       
	    }

	    //Nunca entra aquí
	    System.out.println("Cerrando programa...   :D ");
	    nevera.close();
	}
	}


