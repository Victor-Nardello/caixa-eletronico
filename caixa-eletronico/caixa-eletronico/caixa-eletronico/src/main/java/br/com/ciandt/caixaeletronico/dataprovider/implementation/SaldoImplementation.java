package br.com.ciandt.caixaeletronico.dataprovider.implementation;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ciandt.caixaeletronico.dataprovider.entity.SaldoEntity;
import br.com.ciandt.caixaeletronico.dataprovider.mapper.SaldoDataProviderDomainMapper;
import br.com.ciandt.caixaeletronico.usecase.domain.SaldoDomain;
import br.com.ciandt.caixaeletronico.usecase.gateway.SaldoGateway;

@Component
public class SaldoImplementation implements SaldoGateway {

	@Autowired
	SaldoDataProviderDomainMapper saldoDataProviderDomainMapper;

	@Override
	public SaldoDomain getSaldoContaCorrente() {
		SaldoEntity saldoEntity = new SaldoEntity();
		saldoEntity.setAgencia("2468");
		saldoEntity.setConta("101214");
		saldoEntity.setTipoConta("CC");
		saldoEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		saldoEntity.setLimite(new BigDecimal(400.00));

		if (saldoEntity.getSaldo().doubleValue() < 0) {
			saldoEntity.setDivida(true);
		}

		return saldoDataProviderDomainMapper.toSaldoContaCorrenteDomain(saldoEntity);
	}
 
	@Override
	public SaldoDomain getSaldoContaPoupanca() {
		SaldoEntity saldoEntity = new SaldoEntity();
		saldoEntity.setAgencia("1234");
		saldoEntity.setConta("123456");
		saldoEntity.setTipoConta("CP");
		saldoEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));

		return saldoDataProviderDomainMapper.toSaldoContaPoupancaDomain(saldoEntity);
	}
}