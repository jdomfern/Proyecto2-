import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		incorporarPersonas();

	}

	public static void incorporarPersonas() {
		
		int [] personas = new int [10];
		
		
		String nombre,sexo,ciudad,fisico;
		int edad;
		boolean correcto=true;
		Scanner sc=new Scanner (System.in);
		
			
			System.out.println("Añade un@ nuev@ usuari@s");
			System.out.println("Introduce nombre");
			nombre=sc.nextLine();
			System.out.println("Introduce sexo");
			sexo=sc.nextLine();
			System.out.println("Introduce ciudad");
			ciudad=sc.nextLine();
			System.out.println("Está buen@?");
			fisico=sc.nextLine();
			while(correcto) {
				try {
			System.out.println("Introduce edad");
			edad=sc.nextInt();
			
			correcto=false;
			
			DatosPersonas persona= new DatosPersonas(nombre, edad, sexo, ciudad, fisico);
			DatosPersonas [] arrayPersona = new DatosPersonas[10];
			for (int i=0;i<arrayPersona.length;i++) {
			arrayPersona[i]=persona;
		}
		}
		catch (Exception e) {
			System.out.println("Error al introducir el dato");
			sc.next();
		}
		
		}
	
		

	}
	}

