 package a_ejemplo_banco;

import java.util.LinkedList;
import java.util.ListIterator;

public class c_PruevaListaEnlazada 
{

	public static void main(String[] args) 
	{
		
     LinkedList<String>paices = new LinkedList<String>();
	paices.add("españa");
	paices.add("colombia");
	paices.add("mexico");
	paices.add("peru");
	
	 LinkedList<String>capitales = new LinkedList<String>();
		capitales.add("madrid");
		capitales.add("bogota");
		capitales.add("DF");
		capitales.add("lima");
	
		ListIterator<String>iterA = paices.listIterator();
		ListIterator<String>iterB = capitales.listIterator();
	
		//AÑADIR CAPITALES DELANTE DE PAICES
	while(iterB.hasNext())
	{
		if(iterA.hasNext())
		{
			iterA.next();
		}
		iterA.add(iterB.next());
	}
	
	System.out.println(paices);
	
	//HICE QUE EL ITERADOR DE CAPITALES REGRESE AL INICIO
	iterB=capitales.listIterator();
	
	// ELIMINO DE LA LISTA CAPITALES LOS NUMEROS PARES
	while(iterB.hasNext())
	{
		iterB.next();
		if(iterB.hasNext())
		{
			iterB.next();
			iterB.remove();
		}
	}
	System.out.println(capitales);
	
	//ELIMINO LAS CAPITALES QUE TENGO DE PAICES
	paices.removeAll(capitales);
	System.out.println(paices);
	
	}



	
	
}
