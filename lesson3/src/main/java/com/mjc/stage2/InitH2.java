package com.mjc.stage2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@SpringBootApplication
public class InitH2 {

    public static void main(String[] args) {
        SpringApplication.run(
                InitH2.class,
                "--spring.h2.console.enabled=true"
        );
    }

    @Bean
    private static DataSource getDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("./CREATEDB.sql")
                .addScript("./STUDENT.sql")
                .addScript("./PAYMENTTYPE.sql")
                .addScript("./PAYMENT.sql")
                .addScript("./SUBJECT.sql")
                .addScript("./MARK.sql")
                .build();
    }

}
