package org.example;

import controladores.Jugador;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner Ingresodatos = new Scanner(System.in);
        Jugador Objetojugador = new Jugador();

        int opcion = 0;

        System.out.println("****convocatoria seleccion portugal***");

        do {
            System.out.println("1. agregar un jugador \n2:buscar un jugador por nombre \n3: editar informacion de un jugador \n4:mostrar toda la convocatoria de jugador \n5:salir");
            opcion = Ingresodatos.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("ingrese nombre del jugador");
                    Objetojugador.setNombre(Ingresodatos.next());

                    System.out.println("ingrese apellido del jugador");
                    Objetojugador.setApellidos(Ingresodatos.next());

                    System.out.println("ingrese la edad del jugador");
                    Objetojugador.setEdad(Ingresodatos.nextInt());

                    System.out.println("ingrese  la pocision del jugador");
                    Objetojugador.setPocision(Ingresodatos.next());

                    System.out.println("ingrese donde juega actualmente el  jugador");
                    Objetojugador.setEquipoquejuega(Ingresodatos.next());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }while (opcion !=5);


    }
}