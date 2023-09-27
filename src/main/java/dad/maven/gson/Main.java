package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		String nombre, apellidos;
		int edad;
		Persona p;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("Introduce tus apellidos: ");
		apellidos = entrada.nextLine();
		
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();
		
		p = new Persona(nombre, apellidos ,edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	
		

	}

}
