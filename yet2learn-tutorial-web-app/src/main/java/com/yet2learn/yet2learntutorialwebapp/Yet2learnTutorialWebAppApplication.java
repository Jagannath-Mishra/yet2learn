package com.yet2learn.yet2learntutorialwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.yet2learn.yet2learntutorialwebapp.service.SpringSecurityAuditorAware;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class Yet2learnTutorialWebAppApplication {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new SpringSecurityAuditorAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(Yet2learnTutorialWebAppApplication.class, args);
	}

}
