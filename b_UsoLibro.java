package a_ejemplo_banco;

public class b_UsoLibro {

	public static void main(String[] args)
	{
		b_Libro libro1 = new b_Libro("programacion en java","cristian",1234);
		b_Libro libro2 = new b_Libro("programacion en java 2","cristian",1234);
	
		
		//libro1=libro2;
	if(libro1.equals(libro2))
	{
		System.out.println("LOS LIBROS SON IGUALES");
		System.out.println(libro1.hashCode());
		System.out.println(libro2.hashCode());
	}
	else
	{
		System.out.println("SON DIFERENTES");
		System.out.println(libro1.hashCode());
		System.out.println(libro2.hashCode());
	}
	}

}
