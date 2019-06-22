import java.util.*;
import java.io.*;

public class Grados {

	Scanner leer = new Scanner (System.in);
	
	/**
	 * Convierte de grados celsius a grados farenheit
	 */
	public void convertidorCelsius () {
		double gradosCelsius; //Grados a convertir en farenheit
		double convers;       //Resultado final de la conversion
		System.out.println("Cantidad en grados celsius: ");
		gradosCelsius = leer.nextInt(); //Guarda los grados a convertir
		
		convers=(gradosCelsius*1.8+32); //Convierte los grados celsius a farenheit
		System.out.println("Cantidad en grados farenheit: " + "\n" + convers); //Muestra el resultado

	}
	
	/**
	 * Convierte de grados farenheit a grados celsius
	 */
	public void convertidorFarenheit () {
		double gradosFarenheit;  //Grados a convertir en celsius
		double convers;          //Resultado final de la conversion
		System.out.println("Cantidad en grados farenheit: ");
		gradosFarenheit = leer.nextInt();   //Guarda los grados a convertir
		
		convers=((gradosFarenheit-32)/1.8); //Convierte los grados farenheit a celsius
		System.out.println("Cantidad en grados celsius: " + "\n" + convers); //muestra los resultados

	}
	
	public static void main(String[] args) {
		
		Grados convertidor = new Grados(); //Variable para utilizar los metodos
		
		convertidor.convertidorCelsius(); //Llamada al metodo para convertir celsius 
		
		convertidor.convertidorFarenheit(); //Llamada al metodo para convertir farenheits
		
		
		
		
	
	}

}
