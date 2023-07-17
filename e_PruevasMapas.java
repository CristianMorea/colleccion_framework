package a_ejemplo_banco;

import java.util.HashMap;
import java.util.Map;

public class e_PruevasMapas {

	public static void main(String[] args) 
	{
		//CREANDO LISTA HASHMAP
		HashMap<String, e_Empleado>personal = new HashMap<>();
		
		//AÑADIR OBJETO A LA LISTA HASHMAP
		personal.put("001", new e_Empleado("CRISTIAN"));
		personal.put("002", new e_Empleado("ANA"));
		personal.put("003", new e_Empleado("ANTONIO"));
		personal.put("004", new e_Empleado("SANDRA"));
		
		System.out.println(personal);
		
		//ELIMINADO OBJETO EN HASHMAP
		personal.remove("003");
		System.out.println(personal);
		
		//SUSTITUIR ELEMENTO DENTRO DEL MAPA
		/*
		 * PARA ESTO TENDREMOS QUE AGREGAR UN NUEVO ELEMENTO CON LA
		 * MISMA CLAVE, ESTO HARA QUE SEA REMPLASADO POR EL QUE INGRESEMOS
		 * NUEVO
		 */
		
		personal.put("001", new e_Empleado("Laura"));
		
		System.out.println(personal);
		
		//ENTRYSET
		
		//System.out.println(personal.entrySet());
		for (Map.Entry<String, e_Empleado> entrada : personal.entrySet())
		{
			 e_Empleado valor =   entrada.getValue();
			String clave = entrada.getKey();
			
			System.out.println("clave: "+ clave+ "   valor: "+valor);
			
		}
		
	}

}
