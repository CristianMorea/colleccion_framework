package a_ejemplo_banco;

public class e_Empleado 
{
  private String nombre;
  private double sueldo;
  
  
  
public e_Empleado(String nombre) 
{
	this.nombre = nombre;
	sueldo = 2000;
}



@Override
public String toString() {
	return " [nombre=" + nombre + ", sueldo=" + sueldo + "]";
}
	
	


}
