package a_ejemplo_banco;

import java.util.LinkedList;
import java.util.ListIterator;

public class c_LinkendList_Prueva {

	public static void main(String[] args) 
	{
		
	LinkedList<String>personas = new LinkedList<String>();
     personas.add("pepe");
     personas.add("sandra");
     personas.add("Ana");
     personas.add("Laura");
   
    System.out.println(personas.size());
   
    
    ListIterator<String> it=personas.listIterator();
    it.next();
    it.add("juan");
    
    
    
    for (String persona : personas) 
    {
		System.out.println(persona);
	}

}
}
