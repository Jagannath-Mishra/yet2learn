package com.yet2learn.yet2learntutorialwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

import com.yet2learn.yet2learntutorialwebapp.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurations extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public Pbkdf2PasswordEncoder pbkdf2PasswordEncoder() {
		return new Pbkdf2PasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(pbkdf2PasswordEncoder());

		return authProvider;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/static/**", "/resources/**","/assets/**", "/sign-up").permitAll()
		.antMatchers("/auth-user/**").authenticated()
        .antMatchers("/**").permitAll()
		.antMatchers("/read/**").hasAnyAuthority("CREATOR", "EDITOR", "ADMIN")
		.antMatchers("/create/**").hasAnyAuthority("ADMIN", "CREATOR")
		.antMatchers("/edit/**").hasAnyAuthority("ADMIN","EDITOR")
		.antMatchers("/delete/**").hasAuthority("ADMIN")
		.anyRequest().authenticated().and().formLogin().loginPage("/sign-in").defaultSuccessUrl("/auth-user", true).permitAll().and().logout()
		.permitAll().and().exceptionHandling().accessDeniedPage("/403");

	}

	@Bean
	public AuthenticationManager customAuthenticationManager() throws Exception {
		return authenticationManager();
	}
	
}