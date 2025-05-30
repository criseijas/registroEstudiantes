public class Estudiante {

    public static final String CYAN = "\033[0;36m";
    public static final String RESET = "\u001B[0m";

    private String nombre;
    private String apellido;
    private int id;
    private String carrera;
    private int edad;

    public Estudiante(String nombre, String apellido, int id, String carrera, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return CYAN + "( Nombre: " + nombre + "\n" +
                ", Apellido: " + apellido + "\n" +
                ", Id: " + id + "\n" +
                ", Carrera: " + carrera + "\n" +
                ", Edad: " + edad + ")\n" + RESET;
    }
}
