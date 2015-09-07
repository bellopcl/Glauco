package br.org.catolica;

import java.io.*;
import java.util.*;

public class exemplo {

	private static ValidaTriangulo valida;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.printf("informe o nome do arquivo de texto: \n");
		String nome = ler.nextLine();
		System.out.printf("\nconteudo do arquivo texto");

		try{
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			
			while(linha != null){
				System.out.printf("%s\n", linha);
				linha = lerArq.readLine();
				
				String val1 = linha.substring(0, linha.indexOf(','));
				int a = Integer.parseInt(val1);
				String val2 = linha.substring(linha.indexOf(',')+1, linha.lastIndexOf(','));
				int b = Integer.parseInt(val2);
				String val3 = linha.substring(linha.lastIndexOf(',') +1, linha.length());
				int c = Integer.parseInt(val3);
				setValida(new ValidaTriangulo(a, b, c));
				
			}
			arq.close();
		}catch(IOException e){
			System.out.printf("erra na abertura do arquivo: %s.n", e.getMessage());
		}
		System.out.println();
	}

	public static ValidaTriangulo getValida() {
		return valida;
	}

	public static void setValida(ValidaTriangulo valida) {
		exemplo.valida = valida;
	}

}
