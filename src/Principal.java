import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

         String PURPLE = "\033[0;35m";
         String RESET = "\u001B[0m";

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        SistemaRegistro registro = new SistemaRegistro();

        while(opcion != 5) {

            System.out.println("*** Registro de Estudiantes ***");
            System.out.println("""
                ** Menu ***
                1. Registrar estudiante
                2. Listar estudiantes
                3. Buscar estudiante
                4. Eliminar estudiante
                5. Salir
                """);
            System.out.println("Ingrese una opción del menú: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID: ");
                    int id = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = teclado.nextLine();
                    System.out.println("Ingrese la carrera: ");
                    String carrera = teclado.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();
                    registro.agregarEstudiante(new Estudiante(nombre, apellido, id, carrera, edad));
                    break;
                case 2:
                    System.out.println("Lista de estudiantes: ");
                    registro.listarEstudiantes();
                    break;
                case 3:
                    System.out.println("Ingrese el ID del estudiante: ");
                    int idAlumno = teclado.nextInt();
                    registro.buscarEstudiante(idAlumno);
                    break;
                case 4:
                    System.out.println("Ingrese el ID del estudiante que quiere eliminar: ");
                    int idEliminar = teclado.nextInt();
                    Estudiante estudiante = registro.buscarEstudiante(idEliminar);
                    if (estudiante != null) {
                        registro.eliminarEstudiante(idEliminar);
                        System.out.println(PURPLE + "Estudiante eliminado" + RESET);
                    }else {
                        System.out.println(PURPLE + "No se encontró el estudiante" + RESET);
                    }
                    break;
                case 5:
                    System.out.println(PURPLE + "Gracias por utilizar el registro de estudiantes." + RESET);
                    break;
                default:
                    System.out.println(PURPLE + "La opción ingresada no es válida" + RESET);
                    break;
            }
        }
    }
}
