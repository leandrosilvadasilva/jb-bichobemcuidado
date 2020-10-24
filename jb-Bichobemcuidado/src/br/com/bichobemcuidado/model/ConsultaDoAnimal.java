package br.com.bichobemcuidado.model;

import java.util.Date;

public class ConsultaDoAnimal {
	public Date dataAtendimento; /* = new Date(System.currentTimeMillis()); */
	public String diagnostico;

	public void exibirDiagnostico() {
		System.out.println("Diagnóstico: " + diagnostico);
	}
}
