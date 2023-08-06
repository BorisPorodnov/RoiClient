package net.porodnov.roi;

import lombok.RequiredArgsConstructor;
import net.porodnov.service.RoiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@RequiredArgsConstructor
@SpringBootApplication
public class RoiClientApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(RoiClientApplication.class);
    private final RoiService roiService;

    public static void main(String[] args) {
        SpringApplication.run(RoiClientApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("Получаем список инициатив кот.нах на голосовании.");
        roiService.processPoll();
    }
}
