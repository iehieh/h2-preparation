package com.mjc.stage2.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@SpringBootApplication
public class SqlConnection {

    public static void main(String[] args) {
        SpringApplication.run(
                SqlConnection.class,
                "--spring.h2.console.enabled=true"
        );
    }

    @Bean
    private static DataSource getDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .build();
    }

}
