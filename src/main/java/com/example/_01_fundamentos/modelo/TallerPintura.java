package com.example._01_fundamentos.modelo;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche ha sido reparado en el taller de pintura.";
    }
}
