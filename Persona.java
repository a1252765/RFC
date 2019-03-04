public class Persona{

	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	String fechaNacimiento;
	String rfc;

	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento){
		setNombre(nombre);
		setApellidoPaterno(apellidoPaterno);
		setApellidoMaterno(apellidoMaterno);
		setFechaNacimiento(fechaNacimiento);
		setRFC();
	}
	public void setRFC(){
		rfc = RFC.calculaRFC(nombre, apellidoPaterno,apellidoMaterno,fechaNacimiento);
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;

	}

	public void setFechaNacimiento(String fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;

	}

	public String getNombre(){
		return this.nombre;
	}

	public String getApellidoPaterno(){
		return this.apellidoPaterno;
	}

	public String getApellidoMaterno(){
		return this.apellidoMaterno;
	}

	public String getFechaNacimiento(){
		return this.fechaNacimiento;
	}

}