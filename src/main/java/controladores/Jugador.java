package controladores;

public class Jugador {
    private int id;
    private String nombre;
    private String apellidos;
    private String posicionJugador;
    private int edad;
    private String equipoJuega;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipoJuega() {
        return equipoJuega;
    }

    public void setEquipoJuega(String equipoJuega) {
        this.equipoJuega = equipoJuega;
    }
}