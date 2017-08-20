/**
 * 
 */
package com.gp;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		super.init(auth);
		auth.inMemoryAuthentication().withUser("ganeshp").password("pass_ganeshp_1234").roles("USER").and()
				.withUser("testuser").password("pass_ganeshp_1234_test").roles("USER").and().withUser("tathar")
				.password("pass_tathar_1234").roles("USER", "ADMIN");
	}
}
