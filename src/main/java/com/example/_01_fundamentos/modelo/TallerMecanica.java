package com.example._01_fundamentos.modelo;

import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche ha sido reparado en el taller de mecánica.";
    }
}
