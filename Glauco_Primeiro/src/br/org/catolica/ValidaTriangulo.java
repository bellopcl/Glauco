package br.org.catolica;

public class ValidaTriangulo{
	
	public ValidaTriangulo(int a, int b, int c){
		if(a==b && b==c){
	   		System.out.println("Tri�ngulo Equil�tero");
	   	}else{
		   	if(a==b || a==c){
		   		System.out.println("Tri�ngulo Is�celes");
		   	}else{
		   		System.out.println("Tri�ngulo Escaleno");
		   	}
	   	}
	}

}
