import java.util.Scanner;

public class MetodosB {

	public static void main(String[] args) {

		incorporarPersonas();

	}

	public static void incorporarPersonas() {




		String nombre,sexo,ciudad,fisico;
		int edad = 0;
		boolean correcto=true;
		Scanner sc=new Scanner (System.in);

		do{
			System.out.println("Añade un@ nuev@ usuari@s\n");
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
					}
				catch (Exception e) {
					System.out.println("Error al introducir el dato");
					sc.next();
				}
			
			//NO ESTA BIEN; ALMACENA EL MISMO EN CADA POSICION DE ARRAY. ARREGLAR!!
			DatosPersonas persona= new DatosPersonas(nombre, edad, sexo, ciudad, fisico);
			
			DatosPersonas [] arrayPersona = new DatosPersonas[5];
			
			for (int i=0;i<arrayPersona.length;i++) {
				boolean comprobador=false;
				for(int j=0;j<i;j++){ 

					if(arrayPersona[j]==persona) {
						comprobador=true;
						i++;
					}	
				}
				
				if (!comprobador){
					arrayPersona[i]=persona;
					System.out.println("Si desea añadir un perfil más seleccione 1");
					System.out.println("Seleccione otro número para volver al menú");
					sc.next();
				}
			}
			}
			
			}while(sc.nextInt()==1);
		}		
	


		
	}

