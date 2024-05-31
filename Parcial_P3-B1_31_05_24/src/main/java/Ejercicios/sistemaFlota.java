package Ejercicios;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc05
 */
public class sistemaFlota {
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Vehiculo {
    private final String marca;
    private final String modelo;
    private final int año;
    private final double kilometraje;
    private String conductor;
    private final List<Viaje> viajes;
    private final List<Mantenimiento> mantenimientos;

    public Vehiculo(String marca, String modelo, int año, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.viajes = new ArrayList<>();
        this.mantenimientos = new ArrayList<>();
    }

    public void asignarConductor(String conductor) {
        this.conductor = conductor;
    }

    public void registrarViaje(Date inicio, Date fin, String destino, double kilometraje) {
        Viaje viaje = new Viaje(inicio, fin, destino, kilometraje);
        viajes.add(viaje);
    }

    public void programarMantenimiento(String tipo, Date fecha, String descripcion) {
        Mantenimiento mantenimiento = new Mantenimiento(tipo, fecha, descripcion);
        mantenimientos.add(mantenimiento);
    }
}

class Viaje {
    private final Date inicio;
    private final Date fin;
    private final String destino;
    private final double kilometraje;

    public Viaje(Date inicio, Date fin, String destino, double kilometraje) {
        this.inicio = inicio;
        this.fin = fin;
        this.destino = destino;
        this.kilometraje = kilometraje;
    }
}

class Mantenimiento {
    private final String tipo;
    private final Date fecha;
    private final String descripcion;

    public Mantenimiento(String tipo, Date fecha, String descripcion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
}

class Administrador {
    public void generarInforme(List<Vehiculo> flota) {
    }

    public void recibirAlerta(String mensaje) {
        System.out.println("Alerta: " + mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1;
        vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020, 50000);
        vehiculo1.asignarConductor("Juan");
        vehiculo1.registrarViaje(new Date(2024, 5, 30, 8, 0), new Date(2024, 5, 30, 10, 0), "Oficina", 50);
        vehiculo1.programarMantenimiento("Cambio de aceite", new Date(2024, 6, 1), "Cambiar el aceite y filtros");

        Administrador admin;
        admin = new Administrador();
        admin.recibirAlerta("Vencimiento de seguro para el vehículo 1");
    }
}

    
}

