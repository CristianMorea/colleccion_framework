package a_ejemplo_banco;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * treSet ORDENA LOS ARTICULOS EN BASE A LA INTERFACE COMPARABLE
 * QUE DEBE IMPLEMENTAR EL METODO COMPARETO
 * 
 * 
 * SUELE TENER PROBLEMAS COMO POR EJEMPLO
 * CUANDO NECESITO CREAR OTRA COLECCION DONDE EL ORDENAMIENTO SE HAGA EN
 * BASE A LA DESCRIOCION YA QUE IMPLEMENTAR DOS VECES LA 
 * INTERFACE COMPARABLE NO ES POSIBLE
 * 
 * TAMPOCO ES POSIBLE USASR DOS METODOS COMPARETO
 * 
 * SI NECESITAMOS GUARDAR OBJETOS EN LA COLECCION Y EL 
 * PROGRAMADOR ANTERIOR NO USO LA INTERFACE COMPARABLE
 * 
 * 
 */
public class d_PruevaTreeSet
{

	public static void main(String[] args)
	{
	/*
	 * 	
		TreeSet<String>ordenaPersonas = new TreeSet<>();
		ordenaPersonas.add("sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for (String persona : ordenaPersonas) 
		{
			System.out.println(persona);
		}
	 */
		d_Articulo primero = new d_Articulo(1,"primer articulo");
		d_Articulo segundo = new d_Articulo(2,"segundo articulo");
		d_Articulo tercero = new d_Articulo(3,"tercero articulo");
		
	TreeSet<d_Articulo>ordenArticulos = new TreeSet<>();
	ordenArticulos.add(tercero);
	ordenArticulos.add(primero);
	ordenArticulos.add(segundo);

	for (d_Articulo articulo : ordenArticulos)
	{
		System.out.println(articulo.getDecripcion());
	}
	
	
	
	//ORDENAMIENTO CON DESCRIPCION 
	//d_Articulo comparadorArticulos = new d_Articulo();
	//TreeSet<d_Articulo> comparadorArticulos2 = new TreeSet<d_Articulo>(comparadorArticulos);
	
	//comparadorArticulos compara_art = new comparadorArticulos();
	TreeSet<d_Articulo>ordenArticulos2 = new TreeSet<>(new Comparator<d_Articulo>() 
	{

		@Override
		public int compare(d_Articulo o1, d_Articulo o2) {
			String descripcionA = o1.getDecripcion();
			
			String descripcionB = o2.getDecripcion();
			
			return descripcionA.compareTo(descripcionB);
		}
		
	});

     ordenArticulos2.add(primero);
     ordenArticulos2.add(segundo);
     ordenArticulos2.add(tercero);


	
	System.out.println("---------------------");
	for (d_Articulo d_Articulo : ordenArticulos2) {
		System.out.println(d_Articulo.getDecripcion());
	}
	
	
	
	

}

}