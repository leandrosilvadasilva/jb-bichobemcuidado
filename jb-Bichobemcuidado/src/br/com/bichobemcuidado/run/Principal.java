package br.com.bichobemcuidado.run;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.com.bichobemcuidado.model.ConsultaDoAnimal;
import br.com.bichobemcuidado.model.DonoDoAnimal;

public class Principal {
	public static void main(String[] args) {
		
		Date data = new Date();
		Calendar cal = new GregorianCalendar();
		DonoDoAnimal donoDoAnimal = new DonoDoAnimal();
		String nome = donoDoAnimal.nome;
		
		
		System.out.println("Bem vindo, hoje é " + cal.getTime());
		System.out.println("CADASTRO DO CLIENTE");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite do Dono do Bichinho");
		nome  = scan.nextLine();
		System.out.println("Dono do Bichinho: " + nome );
	
		
		System.out.println("Número da residência:");
		System.out.println(
				donoDoAnimal.numeroRua = scan.nextInt());
		
		/*Consulta*/
		ConsultaDoAnimal consulta = new ConsultaDoAnimal();
		consulta.dataAtendimento = new Date();
		consulta.diagnostico = "Dor de dente. Será remediado por 30 dias";
		
		System.out.println("data da consulta: " + consulta.dataAtendimento);
		consulta.exibirDiagnostico();
		
		
	}
}
