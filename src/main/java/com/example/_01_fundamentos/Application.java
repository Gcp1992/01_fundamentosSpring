package com.example._01_fundamentos;

import com.example._01_fundamentos.modelo.clienteDAO.Cliente;
import com.example._01_fundamentos.modelo.clienteDAO.ClienteDao;
import com.example._01_fundamentos.modelo.coche.Coche;
import com.example._01_fundamentos.modelo.coche.Conductor;
import com.example._01_fundamentos.modelo.coche.Vehiculo;

import com.example._01_fundamentos.modelo.taller.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private SeguroCoche s1;
    @Autowired
    private Cliente c1;
    @Autowired
    private ClienteDao c2;
    @Autowired
    private Coche coche1;
    @Autowired
    private Conductor conductor1;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Coche coche1=new Coche("64567867V","Renault");
        System.out.println(s1.reparar(coche1));*/

        System.out.println("--------------------------------");

        System.out.println("Ejercicio ClienteDAO");

        c1.setNombre("Juan");
        c1.setNIF("60356750V");

        System.out.println(c1.toString());

        System.out.println(c2.insertar(c1));

        System.out.println("--------------------------------");

        System.out.println("Ejercicio Coche");

        coche1.setDeposito(10000);
        System.out.println(coche1.toString());
        System.out.println(coche1.moverse());

        ((Coche)conductor1.getIVehiculo()).setDeposito(20000);
        System.out.println(conductor1.conducir());
        System.out.println(((Coche)conductor1.getIVehiculo()).getDeposito());








    }


}
