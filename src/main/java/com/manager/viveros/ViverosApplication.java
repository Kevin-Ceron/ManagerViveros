package com.manager.viveros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViverosApplication implements CommandLineRunner{
    
        private static Logger LOG = LoggerFactory.getLogger(ViverosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ViverosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Hola Mundo");
    }

}
