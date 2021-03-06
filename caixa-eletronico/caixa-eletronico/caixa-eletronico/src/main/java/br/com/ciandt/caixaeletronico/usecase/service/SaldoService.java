package br.com.ciandt.caixaeletronico.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ciandt.caixaeletronico.usecase.domain.SaldoDomain;
import br.com.ciandt.caixaeletronico.usecase.gateway.SaldoGateway;

@Service
public class SaldoService {

	@Autowired
	SaldoGateway saldoGateway;

	public SaldoDomain getSaldo(String tipoConta) {

		if ("CC".equals(tipoConta)) {
			return saldoGateway.getSaldoContaCorrente();
		} else if("CP".equals(tipoConta)) {
			return saldoGateway.getSaldoContaPoupanca();
		}
		return null;
	}
}