package net.porodnov.roi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoiClientApplication implements CommandLineRunner {
    private final static Logger log = LoggerFactory.getLogger(RoiClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RoiClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Application executed.");
    }
}
