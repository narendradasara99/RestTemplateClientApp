package com.nare;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	@Bean
	public RestTemplate restmethod() {
		RestTemplate r=new RestTemplate();
		return r;
	}

}
