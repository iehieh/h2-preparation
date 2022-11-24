package com.mjc.stage2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbInformationPrinter implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(DbInformationPrinter.class);

    @Value("${lesson}")
    private String lessonNumber;
    @Value("#{ T(java.net.InetAddress).getLocalHost().getHostAddress()}")
    private String hostAddress;
    @Value("${server.port}")
    private String port;
    @Value("${spring.h2.console.path}")
    private String h2Console;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Override
    public void run(String... args) throws Exception {

        log.info("H2 was populated for the Lesson " + lessonNumber + ".");
        log.info("Console is available at http://" + hostAddress + ":" + port + h2Console);
        log.info("JDBC URL: " + jdbcUrl);
        log.info("User Name: sa");
        log.info("Password:");

    }

}
