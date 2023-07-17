package a_ejemplo_banco;

import java.util.Comparator;

public class d_Articulo<Ad_Articulo> implements Comparable<d_Articulo>
{
   private int num;
   private String decripcion;
   
   

   
	public d_Articulo(int num, String decripcion) 
	{
		this.num = num;
		this.decripcion = decripcion;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	@Override
	public int compareTo(d_Articulo o) {
		
		return num - o.num;
	}

	public d_Articulo() {
	}

	/*
	 * @Override
	public int compare(d_Articulo o1, d_Articulo o2)
	{
		String descripcionA = o1.getDecripcion();
		
		String descripcionB = o2.getDecripcion();
		
		//retorna la comparacion entre ambas descripciones
		return descripcionA.compareTo(descripcionB);
	}
	 */

	
	
	
	
}
