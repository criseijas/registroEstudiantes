import java.util.ArrayList;
import java.util.List;

public class SistemaRegistro {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()){
            System.out.println("No hay estudiantes registrados");
        }else {
            System.out.println(estudiantes.toString());
        }
    }

    public void buscarEstudiante(int id) {

        for (Estudiante alumno : estudiantes) {
            if (alumno.getId() == id) {
                System.out.println(alumno);
                return;
            }
        }
        System.out.println("El id no es válido");
    }

    public void eliminarEstudiante(int id) {

        estudiantes.removeIf(estudiante -> estudiante.getId() == id);
        System.out.println("Estudiante eliminado");
    }

}
