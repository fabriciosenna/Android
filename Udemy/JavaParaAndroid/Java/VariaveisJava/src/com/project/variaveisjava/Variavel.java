package com.project.variaveisjava;

public class Variavel {
	
	/*Variáveis
	 	A capacidade de armazenamento de cada um dos tipos é diferente.
		byte: é capaz de armazenar valores entre -128 até 127.
		short: é capaz de armazenar valores entre – 32768 até 32767.
		int: é capaz de armazenar valores entre –2147483648 até 2147483647.
		long: é capaz de armazenar valores entre –9223372036854775808 até 9223372036854775807.
		float: é capaz de armazenar valores entre 3.4e–038 até 3.4e+038
		double: é capaz de armazenar valores entre 1 .7e–308 até 1.7e+308
	 */
	public static void main(String[] args) {

		byte minhaVariavelByte = 2;
		int minhaVariavelInt = 1000000;
		long minhaVariavelLong = 1000000000;
		
		float minhaVariavelFloat = 1.3f;
		double minhaVariavelDouble = 1.234543543;
		
		boolean minhaVariavelBoolean = true;
		
		String minhaVariavelString = "café";

		
		System.out.println(minhaVariavelByte);
		System.out.println(minhaVariavelInt);
		System.out.println(minhaVariavelLong);
		
		System.out.println(minhaVariavelFloat);
		System.out.println(minhaVariavelDouble);

		System.out.println(minhaVariavelBoolean);

		System.out.println(minhaVariavelString +" "+minhaVariavelByte);




		
	}

}
