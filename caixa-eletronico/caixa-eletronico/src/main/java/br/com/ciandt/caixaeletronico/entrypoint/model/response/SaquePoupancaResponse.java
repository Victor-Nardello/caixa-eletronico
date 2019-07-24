package br.com.ciandt.caixaeletronico.entrypoint.model.response;

import java.math.BigDecimal;

public class SaquePoupancaResponse extends SaqueResponse{
	
	private BigDecimal saldo;
	private BigDecimal valorSaque;
	
	public BigDecimal getSaldo() {return saldo;}
	
	public void setSaldo(BigDecimal saldo) {this.saldo = saldo;}
	
	public BigDecimal getValorSaque() {return valorSaque;}
	
	public void setValorSaque(BigDecimal valorSaque) {this.valorSaque = valorSaque;}
}