package Grupo1.com;

public class Alumnos {
    private int id;
    private int registro;
    private String nombre;
    private String fecha;
    private String genero;

    public Alumnos(int id, int registro, String nombre, String fecha, String genero) {
        this.id = id;
        this.registro = registro;
        this.nombre = nombre;
        this.fecha = fecha;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
