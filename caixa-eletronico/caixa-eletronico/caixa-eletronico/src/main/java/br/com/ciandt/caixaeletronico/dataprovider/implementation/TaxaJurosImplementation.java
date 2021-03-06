package br.com.ciandt.caixaeletronico.dataprovider.implementation;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ciandt.caixaeletronico.dataprovider.entity.TaxaJurosEntity;
import br.com.ciandt.caixaeletronico.dataprovider.mapper.TaxaDataproviderDomainMapper;
import br.com.ciandt.caixaeletronico.usecase.domain.TaxaJurosCCDomain;
import br.com.ciandt.caixaeletronico.usecase.domain.TaxaJurosCPDomain;
import br.com.ciandt.caixaeletronico.usecase.gateway.TaxaGateway;

@Component
public class TaxaJurosImplementation implements TaxaGateway {

	@Autowired
	TaxaDataproviderDomainMapper taxaDataproviderDomainMapper;

	@Override
	public TaxaJurosCCDomain getTaxaJurosCC15() {

		TaxaJurosEntity taxaJurosEntity = new TaxaJurosEntity();
		taxaJurosEntity.setAgencia("1234");
		taxaJurosEntity.setConta("CC");
		taxaJurosEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		taxaJurosEntity.setLimite(new BigDecimal(6000));
		taxaJurosEntity.setTaxaJuros(new BigDecimal(15));
		
		double saldo = taxaJurosEntity.getSaldo().doubleValue();
		taxaJurosEntity.setSaldoJurosCalculado(new BigDecimal(Math.floor(saldo + (saldo * 15.0) / 100)));

		return taxaDataproviderDomainMapper.getTaxaJurosCC(taxaJurosEntity);
	}
	
	@Override
	public TaxaJurosCCDomain getTaxaJurosCC10() {

		TaxaJurosEntity taxaJurosEntity = new TaxaJurosEntity();
		taxaJurosEntity.setAgencia("1234");
		taxaJurosEntity.setConta("CC");
		taxaJurosEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		taxaJurosEntity.setLimite(new BigDecimal(13000));
		taxaJurosEntity.setTaxaJuros(new BigDecimal(10));
		
		double saldo = taxaJurosEntity.getSaldo().doubleValue();
		taxaJurosEntity.setSaldoJurosCalculado(new BigDecimal(Math.floor(saldo + (saldo * 10.0) / 100)));

		return taxaDataproviderDomainMapper.getTaxaJurosCC(taxaJurosEntity);
	}
	
	@Override
	public TaxaJurosCCDomain getTaxaJurosCC20() {

		TaxaJurosEntity taxaJurosEntity = new TaxaJurosEntity();
		taxaJurosEntity.setAgencia("1234");
		taxaJurosEntity.setConta("CC");
		taxaJurosEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		taxaJurosEntity.setLimite(new BigDecimal(8000));
		taxaJurosEntity.setTaxaJuros(new BigDecimal(20));
		
		double saldo = taxaJurosEntity.getSaldo().doubleValue();
		taxaJurosEntity.setSaldoJurosCalculado(new BigDecimal(Math.floor(saldo + (saldo * 20.0) / 100)));

		return taxaDataproviderDomainMapper.getTaxaJurosCC(taxaJurosEntity);
	}

	@Override
	public TaxaJurosCPDomain getTaxaJurosCP5() {

		TaxaJurosEntity taxaJurosEntity = new TaxaJurosEntity();
		taxaJurosEntity.setAgencia("1234");
		taxaJurosEntity.setConta("CP");
		taxaJurosEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		taxaJurosEntity.setLimite(new BigDecimal(12000));
		taxaJurosEntity.setTaxaJuros(new BigDecimal(5));
		
		double saldo = taxaJurosEntity.getSaldo().doubleValue();
		taxaJurosEntity.setSaldoJurosCalculado(new BigDecimal(Math.floor(saldo + (saldo * 5.0) / 100)));

		return taxaDataproviderDomainMapper.getTaxaJurosCP(taxaJurosEntity);
	}
	
	@Override
	public TaxaJurosCPDomain getTaxaJurosCP3() {

		TaxaJurosEntity taxaJurosEntity = new TaxaJurosEntity();
		taxaJurosEntity.setAgencia("1234");
		taxaJurosEntity.setConta("CP");
		taxaJurosEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		taxaJurosEntity.setLimite(new BigDecimal(4000));
		taxaJurosEntity.setTaxaJuros(new BigDecimal(3));
		
		double saldo = taxaJurosEntity.getSaldo().doubleValue();
		taxaJurosEntity.setSaldoJurosCalculado(new BigDecimal(Math.floor(saldo + (saldo * 3.0) / 100)));

		return taxaDataproviderDomainMapper.getTaxaJurosCP(taxaJurosEntity);
	}
	
	@Override
	public TaxaJurosCPDomain getTaxaJurosCP8() {

		TaxaJurosEntity taxaJurosEntity = new TaxaJurosEntity();
		taxaJurosEntity.setAgencia("1234");
		taxaJurosEntity.setConta("CP");
		taxaJurosEntity.setSaldo(new BigDecimal(Math.floor(Math.random()*9999 - 1) + -999));
		taxaJurosEntity.setLimite(new BigDecimal(6700));
		taxaJurosEntity.setTaxaJuros(new BigDecimal(8));
		
		double saldo = taxaJurosEntity.getSaldo().doubleValue();
		taxaJurosEntity.setSaldoJurosCalculado(new BigDecimal(Math.floor(saldo + (saldo * 8.0) / 100)));

		return taxaDataproviderDomainMapper.getTaxaJurosCP(taxaJurosEntity);
	}
}