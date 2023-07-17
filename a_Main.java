package a_ejemplo_banco;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a_Main {

	public static void main(String[] args)
	{
	a_Cliente cl1 = new a_Cliente("crsitian", "90830", 200000);
	a_Cliente cl2 = new a_Cliente("david", "0002",250000 );
	a_Cliente cl3 = new a_Cliente("aNA", "0003", 300000);
	a_Cliente cl4 = new a_Cliente("SARA", "0004", 500000);
	a_Cliente cl5 = new a_Cliente("crsitian", "90830", 200000);
	// no puedo instanciar una interfaz por eso uso una clase de la interfas set
	
	
	//COLECCION HASHSET
	// - NO PERMITE DUPLICADOS
	// - RAPIDA
	// - NO ORDENADO
	// - NO ACCESO ALEATORIO
	
	Set<a_Cliente>clientesBanco =new HashSet<a_Cliente>();
	clientesBanco.add(cl1);
	clientesBanco.add(cl2);
	clientesBanco.add(cl3);
	clientesBanco.add(cl3);
	clientesBanco.add(cl4);
	clientesBanco.add(cl5);


	/*METODO HASHCODE DE CLASE SET
	 * ES UN NUMERO QUE HACE REFERENCIA A LA LOCALIZACION
	 * DEL OBJETO QUE TENEMOS EN LA MEMORIA HEAP
	 */
	
	
	
	
	
	
	/*INTERFAS ITERATOR<T>
	 * METODOS
	 * E NEXT()SIGUIENTE ELEMENTO DE LA COLECCION
	 * BOOLEAN HASNEXT() COMPARA SI HAY UN SIGUIENTE ELEMENTO
	 * VOID REMOVE() ELIMINA
	 * 
	 * 
	 * MEJORES OPERACIONES USANDO ITERATOR
	 * ELIMINAR 
	 * 
	 * MEJORES OPERACIONES USANTO FOR EACH
	 * RECORRER ARREGLO E IMPRIMIR DATOS
	 * 
	 */

	//metodo para eliminar cliente con iterator dado un atributo
	 Iterator<a_Cliente> it=clientesBanco.iterator();
	while(it.hasNext())
	{
	String nombre_cliente=it.next().getNombre();
	if(nombre_cliente.equals("crsitian"))
	{
		it.remove();
	}
	
	}
	
	//EXISTE O NO UN ELEMENTO
	
System.out.println(cl2 + " es "+clientesBanco.contains(cl2)+ "  que se encuentra en la lista");
	
	
	
	//imprimiendo informacion con for each
	 for (a_Cliente cliente : clientesBanco) 
		{
		
		 System.out.println("nombre: "+cliente.getNombre()+
		 " cuenta: "+cliente.getN_cuenta()+
				" saldo:  "+cliente.getSaldo());
				
		}
	
	}
	

}