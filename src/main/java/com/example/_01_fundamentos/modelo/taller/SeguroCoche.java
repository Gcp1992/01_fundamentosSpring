package com.example._01_fundamentos.modelo.taller;

import org.springframework.stereotype.Component;

@Component
public class SeguroCoche implements ITaller{
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche() {
        this.taller= new TallerMecanica();
        this.aseguradora = "";
    }

    @Override
    public String reparar(Coche c) {
        String resultado = taller.reparar(c);
        return ("El coche ha sido reparado por " + aseguradora + ". " + resultado);

    }
}
