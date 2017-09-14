package com.projetos.condicionais;

public class Condicional {

	public static void main(String[] args) {
		
		boolean teste = true;
		int media = 5;
		
		//se (executa o laço apenas se for verdadeiro)
		if(media < 6){
			System.out.println("Reprovado");
		}else if (media >= 6 && media <= 8){
			System.out.println("Aprovado");
		}else if (media > 8 ){
			System.out.println("Aprovado - Excelente");
		}
	}

}
