package com.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired private UserDetailsService userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(this.userDetailsService)
			.passwordEncoder(passwordEncoder());
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.formLogin()
			.usernameParameter("emailAttr")
			.passwordParameter("passwordAttr")
			.loginPage("/login")
			.loginProcessingUrl("/login") // Submit action
//			.successHandler(new CustomAuthenticationSuccessHandler())
			.failureUrl("/login?fail=true")
		.and()
			.logout()
			.logoutUrl("/logout")
			.deleteCookies("JSESSIONID", "RememberMeCooking")
			.invalidateHttpSession(true)
		.and()
			.authorizeRequests()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
			.anyRequest().permitAll()
		.and()
			.exceptionHandling().accessDeniedPage("/403")
		.and()
			.sessionManagement().maximumSessions(1)
		.and().and()
			.rememberMe()
			.rememberMeParameter("rememberMe")
			.key("seper secret key")
			.rememberMeCookieName("RememberMeCooking")
			.tokenValiditySeconds(60 * 60 * 24 * 31);
	}
	
	
}
