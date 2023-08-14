package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.BusinessAccount;
import com.model.FixedAccount;
import com.model.SalaryAccount;
import com.model.SavingAccount;
import com.service.BankingService;

@Configuration
@ComponentScan("com")
public class AppConfig {

	@Bean
	public SavingAccount sa() {
		return new SavingAccount();
	}
	@Bean
	public FixedAccount fa() {
		return new FixedAccount();
	}
	@Bean
	public BankingService service() {
		return new BankingService(sal());
	}
	@Bean
	public BusinessAccount ba() {
		return new BusinessAccount();
	}
	@Bean
	public SalaryAccount sal() {
		return new SalaryAccount();
	}
}
