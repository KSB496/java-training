package com.example.springweb;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebAppSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource; 
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/home").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/manager").hasAuthority("MANAGER")
		.antMatchers("/employee").hasAuthority("EMPLOYEE")
		.antMatchers("/common").hasAnyAuthority("ADMIN","MANAGER")
		.antMatchers("/qa").hasAnyAuthority("QA","ADMIN","MANAGER")
		.antMatchers("/hs").hasAnyAuthority("HS","ADMIN","MANAGER")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome", true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.and()
		.exceptionHandling()
		.accessDeniedPage("/accessdenied");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		/*auth.inMemoryAuthentication().withUser("admin").password("{noop}admin123").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("manager").password("{noop}manager123").authorities("MANAGER");
		auth.inMemoryAuthentication().withUser("employee").password("{noop}employee123").authorities("EMPLOYEE");*/
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("select user_name,user_pwd,user_enabled from user where user_name=?")
		.authoritiesByUsernameQuery("select user_name,user_role from user where user_name=?")
		.passwordEncoder(bCryptPasswordEncoder);
		
	}
	
	/*@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().antMatchers("/home").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/manager").hasAuthority("MANAGER")
		.antMatchers("/employee").hasAuthority("EMPLOYEE")
		.antMatchers("/common").hasAnyAuthority("ADMIN","MANAGER")
		.antMatchers("/qa").hasAnyAuthority("QA","ADMIN","MANAGER")
		.antMatchers("/hs").hasAnyAuthority("HS","ADMIN","MANAGER")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome", true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.and()
		.exceptionHandling()
		.accessDeniedPage("/accessdenied");
		return http.build();
	}
	@Bean
	public UserDetailsManager authenticateUsers(){
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		
		users.setAuthoritiesByUsernameQuery("select user_name,user_pwd,user_enabled from user where user_name=?");
		users.setUsersByUsernameQuery("select user_name,user_role from user where user_name=?");
		return users;
	}*/
	
	

	
}
