package controladores;

public class Jugador {
        private  int id;
        private String nombre;
       private String apellidos;
       private int edad;
       private  String pocision;
       private  String equipoquejuega;

    public Jugador(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPocision() {
        return pocision;
    }

    public void setPocision(String pocision) {
        this.pocision = pocision;
    }

    public String getEquipoquejuega() {
        return equipoquejuega;
    }

    public void setEquipoquejuega(String equipoquejuega) {
        this.equipoquejuega = equipoquejuega;
    }

    public Jugador() {

    }
}
