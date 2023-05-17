package com.example._01_fundamentos.modelo.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coche implements Vehiculo {


    private int deposito;

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se está moviendo.";
        } else {
            return "El coche no puede moverse. No hay gasolina en el depósito.";
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "deposito=" + deposito +
                '}';
    }
}

