package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager setup() {
		//VERSION-1
		/*
		 * ArrayList<GrantedAuthority> l=new ArrayList<>(); l.add(new
		 * SimpleGrantedAuthority("adimn")); l.add(new SimpleGrantedAuthority("user"));
		 * UserDetails abhilash=new User("abilash","123",l); InMemoryUserDetailsManager
		 * i=new InMemoryUserDetailsManager(); i.createUser(abhilash); return i;
		 */
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
	  
	  
//	 
	/*
	 * @Bean public PasswordEncoder pwden() { return new BCryptPasswordEncoder(); }
	 */


	
}
  
