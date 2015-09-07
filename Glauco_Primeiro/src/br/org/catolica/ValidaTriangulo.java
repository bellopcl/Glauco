package br.org.catolica;

public class ValidaTriangulo{
	
	public ValidaTriangulo(int a, int b, int c){
		if(a==b && b==c){
	   		System.out.println("Triângulo Equilátero");
	   	}else{
		   	if(a==b || a==c){
		   		System.out.println("Triângulo Isóceles");
		   	}else{
		   		System.out.println("Triângulo Escaleno");
		   	}
	   	}
	}

}
