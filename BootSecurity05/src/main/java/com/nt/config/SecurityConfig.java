package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain dofilter(HttpSecurity http) throws Exception {
			http.authorizeHttpRequests(auth -> auth
					  .requestMatchers("/hi","/hu").authenticated()
					  .requestMatchers("/bye").permitAll()
					  .requestMatchers("/hello").denyAll()
					  .requestMatchers("/yo").hasRole("admin")
					.anyRequest().authenticated())
			.httpBasic(Customizer.withDefaults())
			.formLogin(Customizer.withDefaults());
			
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager setup() {
		//VERSION-2
		UserDetails user=User.withUsername("abi")
				.password("anil")
				.roles("admin","user")
				.build();
		UserDetails user1=User.withUsername("mohan")
				.password("mohan")
				.roles("user")
				.build();
				return new InMemoryUserDetailsManager(user1,user);

		
	}
	
	  @Bean public PasswordEncoder pwden() { 
		  return  NoOpPasswordEncoder.getInstance(); 
	  }
	  
	  


	
}
  
