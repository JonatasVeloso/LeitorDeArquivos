package br.com.jonatas.leitordearquivo.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeituraComCodigo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("TesteLeitura.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br 	= new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			if(linha.length() > 3) {
				if(linha.substring(0, 3).equals("505")) {
					System.out.println("Nota: " + linha.substring(4, 14));
				}
				if(linha.substring(0, 3).equals("506")) {
					System.out.println("CNPJ: " + linha.substring(4, 18));
				}
			
			}
			
			linha = br.readLine();
		}
	}
}
