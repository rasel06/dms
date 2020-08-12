package com.rzr.dms.controllers;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        		.antMatchers("/admin/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
        .formLogin()
                .loginPage("/login")
                .permitAll();

		/*
		 * http.authorizeRequests() .antMatchers("/", "/home").permitAll()
		 * .hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
		 * .antMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
		 * .antMatchers("/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
		 * .antMatchers("/delete/**").hasAuthority("ADMIN")
		 * 
		 * .anyRequest().authenticated() .and() .formLogin().permitAll() .and()
		 * .logout().permitAll();
		 */
		/*
		 * .and() .exceptionHandling().accessDeniedPage("/403");
		 */

	}
}
