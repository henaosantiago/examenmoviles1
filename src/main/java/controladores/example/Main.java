package controladores.example;

import controladores.Jugador;

import java.util.ArrayList;
import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner Ingresodatos = new Scanner(System.in);

            ArrayList<Jugador> jugadores = new ArrayList<>();

            int opcion = 0;



            do {
                System.out.println("**** CONVOCATORIA SELECCION  PORTUGAL ****");
                System.out.println("1. Agregar un jugador \n2. Buscar un jugador por numero " +
                        "\n3. Editar informacion de un jugador. \n4. Mostrar toda la convocatoria de jugadores" +
                        "\n5. Salir");
                System.out.print("Ingrese la opcion: ");
                opcion = Ingresodatos.nextInt();

                switch (opcion) {

                    case 1:
                        Jugador objetojugador = new Jugador();

                        System.out.println("Ingrese nombre del jugador");
                        objetojugador.setNombre(Ingresodatos.next());

                        System.out.println("Ingrese Apellido del jugador");
                        objetojugador.setApellidos(Ingresodatos.next());

                        System.out.println("Ingrese la edad del jugador");
                        objetojugador.setEdad(Ingresodatos.nextInt());

                        System.out.println("Ingrese la posicion del jugador");
                        objetojugador.setPosicionJugador(Ingresodatos.next());

                        System.out.println("Ingrese el Equipo donde juega actualmente");
                        objetojugador.setEquipoJuega(Ingresodatos.next());

                        System.out.println("Ingrese el  numero de camiseta");
                        objetojugador.setId(Ingresodatos.nextInt());

                        jugadores.add(objetojugador);

                        break;

                    case 2:
                        int buscarJugador;
                        System.out.println("\nBuscar jugador");
                        System.out.print("*Ingrese el numero del jugador que desea buscar:");
                        buscarJugador = Ingresodatos.nextInt();
                        boolean jugadorNoEncontrado = false;
                        for (Jugador jugador : jugadores) {
                            if (jugador.getId() == buscarJugador) {
                                System.out.println("#El numero de la camisa es: " + jugador.getId());
                                System.out.println("#El nombre del jugador es: " + jugador.getNombre());
                                System.out.println("#El apellido del jugador es: " + jugador.getApellidos());
                                System.out.println("#La posicion del jugador es: " + jugador.getPosicionJugador());
                                System.out.println("#La edad del jugador es: " + jugador.getEdad());
                                System.out.println("#El equipo donde juega es: " + jugador.getEquipoJuega());
                                jugadorNoEncontrado = false;
                                break;
                            } else {
                                jugadorNoEncontrado = true;
                            }
                        }
                        if (jugadorNoEncontrado) {
                            System.out.println("El jugador no fue encontrado.");
                        } else {
                            System.out.println("La busqueda fue exitosa");
                        }


                        break;
                    case 3:
                        int editarJugador;
                        System.out.println("\nEditar jugador");
                        System.out.print("-Ingrese el número del jugador que desea editar: ");
                        editarJugador = Ingresodatos.nextInt();
                        int optionEditar;

                        for (Jugador jugador : jugadores) {
                            if (jugador.getId() == editarJugador) {
                                System.out.println("** El jugador está en la base de datos **");

                                do {
                                    System.out.println("1. Editar numero de camiseta");
                                    System.out.println("2. Editar nombres");
                                    System.out.println("3. Editar apellidos");
                                    System.out.println("4. Editar posicion del jugador");
                                    System.out.println("5. Editar Edad del jugador");
                                    System.out.println("6. Editar equipo del jugador");
                                    System.out.println("7. Salir de la edición del jugador");
                                    System.out.print("Digite una opcion: ");
                                    optionEditar = Ingresodatos.nextInt();
                                    System.out.println("\n");

                                    switch (optionEditar) {
                                        case 1:
                                            int nuevoNumeroCamiseta;
                                            System.out.print("-Ingrese el nuevo numero de la camiseta del jugador: ");
                                            nuevoNumeroCamiseta = Ingresodatos.nextInt();
                                            for (Jugador verificarJugador : jugadores) {
                                                if (verificarJugador.getId() == nuevoNumeroCamiseta) {
                                                    System.out.println("El numero de camisa ya existe.");
                                                } else {
                                                    jugador.setId(nuevoNumeroCamiseta);
                                                    System.out.println("Cambio de numero exitoso.");
                                                }
                                            }
                                            break;

                                        case 2:
                                            System.out.println("-Ingrese el nuevo nombre del jugador: ");
                                            jugador.setNombre(Ingresodatos.next());
                                            break;

                                        case 3:
                                            System.out.print("-Ingrese el nuevo apellido del jugador");
                                            jugador.setApellidos(Ingresodatos.next());
                                            break;

                                        case 4:
                                            System.out.print("-Ingrese la nueva posición del jugador");
                                            jugador.setPosicionJugador(Ingresodatos.next());
                                            break;

                                        case 5:
                                            System.out.print("-Ingrese la nueva edad del jugador: ");
                                            int nueva_Edad = Ingresodatos.nextInt();
                                            jugador.setEdad(nueva_Edad);
                                            break;

                                        case 6:
                                            System.out.print("-Ingrese el nuevo equipo del jugador: ");
                                            jugador.setEquipoJuega(Ingresodatos.next());
                                            break;

                                        case 7:
                                            System.out.println("Has elegido salir del editor.");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida.");

                                    }
                                } while (optionEditar != 7);

                            } else {
                                System.out.println("Jugador no encontrado.");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("\nLista de jugadores de portugal");
                        for (Jugador jugador:jugadores) {
                            System.out.println("**************** jugador ****************");
                            System.out.println("-El numero: " + jugador.getId());
                            System.out.println("-El nombre del jugador es: " + jugador.getNombre());
                            System.out.println("-El apellido del jugador es: " + jugador.getApellidos());
                            System.out.println("-La posicion del jugador es: "+ jugador.getPosicionJugador());
                            System.out.println("-La edad del jugador es: " + jugador.getEdad());
                            System.out.println("-El equipo del jugador es: " + jugador.getEquipoJuega()+"\n");
                        }


                        break;

                    case 5:
                        System.out.println("Elegiste la opcion salir.... Adios");
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");


                }


            } while (opcion != 5);
        }
    }