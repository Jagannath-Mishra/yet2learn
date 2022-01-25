package com.yet2learn.yet2learntutorialwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
public class Yet2learnTutorialWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Yet2learnTutorialWebAppApplication.class, args);
	}

}
