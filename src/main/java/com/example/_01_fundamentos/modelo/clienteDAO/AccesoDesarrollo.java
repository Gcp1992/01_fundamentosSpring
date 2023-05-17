package com.example._01_fundamentos.modelo.clienteDAO;

public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        // Imprimir el nombre y NIF del cliente insertado
        System.out.println("Insertando cliente en entorno de desarrollo:");
        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("NIF: " + c1.getNIF());

        // Devolver un mensaje de confirmación
        return "Cliente insertado en el entorno de desarrollo";
    }
}
