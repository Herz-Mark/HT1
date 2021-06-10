package Grupo1.com;

public class Profesores {
    private int id;
    private int carnet;
    private String nombre;
    private String fechaNac;
    private String fechaCont;
    private String genero;

    public Profesores(int id, int carnet, String nombre, String fechaNac, String fechaCont, String genero) {
        this.id = id;
        this.carnet = carnet;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaCont = fechaCont;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaCont() {
        return fechaCont;
    }

    public void setFechaCont(String fechaCont) {
        this.fechaCont = fechaCont;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
