package com.example._01_fundamentos;

import com.example._01_fundamentos.modelo.Coche;
import com.example._01_fundamentos.modelo.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private SeguroCoche s1;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Coche coche1=new Coche("64567867V","Renault");
        System.out.println(s1.reparar(coche1));
    }
}
