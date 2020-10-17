package br.com.bichobemcuidado.run;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite do Dono do Animal");
		String nomeDoDono = scan.nextLine();
		System.out.println("Dono do Bichinho: " + nomeDoDono);
	}
}
