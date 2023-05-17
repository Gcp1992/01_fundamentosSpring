package com.example._01_fundamentos.modelo.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    private Vehiculo IVehiculo;

    public Conductor() {
    }

    public Conductor(Vehiculo vehiculo) {
        this.IVehiculo = vehiculo;
    }

    public String conducir() {
        return IVehiculo.moverse();
    }

    public Vehiculo getIVehiculo() {
        return IVehiculo;
    }

    public void setIVehiculo(Vehiculo IVehiculo) {
        this.IVehiculo = IVehiculo;
    }
}
