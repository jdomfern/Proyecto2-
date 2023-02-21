
public class DatosPersonas {


		// atributos

		protected String nombre;

		protected int edad;

		protected String sexo;

		protected String ciudad;

		protected String complexion;

		public DatosPersonas() {

		// metodos

		this.nombre = "";

		this.edad = 18;

		this.sexo = "";

		this.ciudad = "";

		this.complexion = "";

		}

		// metodos
		
		public DatosPersonas(String nombre, int edad, String sexo, String ciudad, String complexion) {

		this.nombre = nombre;

		this.edad = edad;

		this.sexo = sexo;

		this.ciudad = ciudad;

		this.complexion = complexion;

		}

		public String getNombre() {

		return nombre;

		}

		public void setNombre(String nombre) {

		this.nombre = nombre;

		}

		public int getEdad() {

		return edad;

		}

		public void setEdad(int edad) {

		this.edad = edad;

		}

		public String getSexo() {

		return sexo;

		}

		public void setSexo(String sexo) {

		this.sexo = sexo;

		}

		public String getCiudad() {

		return ciudad;

		}

		public void setCiudad(String ciudad) {

		this.ciudad = ciudad;

		}

		public String getComplexion() {

		return complexion;

		}

		public void setComplexion(String complexion) {

		this.complexion = complexion;

		}

		@Override

		public String toString() {

		return "DatosPersonas [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", ciudad=" + ciudad

		+ ", complexion=" + complexion + "]";

		}

		}

