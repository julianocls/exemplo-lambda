package com.exemplo.model;

public class Fatura {

	private String emailDevedor;
	private double valor;
	private Boolean emailEnviado;

	public Fatura(String emailDevedor, double valor) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
	}

	public String getEmailDevedor() {
		return emailDevedor;
	}

	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String resumo() {
		return "Fatura com valor de " + this.getValor();
	}

	public Boolean getEmailEnviado() {
		return emailEnviado;
	}

	public void setEmailEnviado(Boolean emailEnviado) {
		this.emailEnviado = emailEnviado;
	}
	
	public void atualizarStatus() {
		System.out.println("Atualizando fatura de valor R$" + this.getValor());
	}

}
