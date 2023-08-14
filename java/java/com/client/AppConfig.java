package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.domain.UserAccount;
import com.repo.AccountImpl;
import com.repo.AccountRepo;
import com.service.TransferService;
import com.service.TransferServiceImpl;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppConfig {

}
