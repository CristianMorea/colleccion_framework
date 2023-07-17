package a_ejemplo_banco;

import java.util.Objects;

public class b_Libro 
{
  private String titulo;
  private String autor;
  private int ISBN;

  public b_Libro(String titulo, String autor, int iSBN) {
	this.titulo = titulo;
	this.autor = autor;
	ISBN = iSBN;
}

@Override
public String toString() {
	return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + "]";
}

@Override
public int hashCode() {
	return Objects.hash(ISBN);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	b_Libro other = (b_Libro) obj;
	return ISBN == other.ISBN;
}


//METODOS QUE ME DA ECLIPCE PARA NO TNERE QUE SOOBRE ESCRIR
//YO LOS METOSOS

/*
 * public boolean equals(Object obj)
{
	if(obj instanceof Libro)
	{
		Libro otro =(Libro)obj;
		if(this.ISBN==otro.ISBN)
		{
			return true;
		}else
		{
			return false;
		}
	}else
	{
		return false;
	}
}
 */



  
}
