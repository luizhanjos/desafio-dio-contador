package br.com.santander.app;
import java.util.Scanner;

import br.com.santander.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero do parametro: ");
		int nmParametro1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero do parametro: ");
		int nmParametro2 = sc.nextInt();
		
		
		try {
			contar(nmParametro1, nmParametro2);
			
		}catch (ParametrosInvalidosException e) {
			System.out.println("Exceção capturada: " + e.getMessage());
		}
		
		
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}else {
			int contagem = parametroDois - parametroUm;
			
			for(int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	}
}
