import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        SistemaRegistro registro = new SistemaRegistro();

        while(opcion != 6) {

            System.out.println("*** Registro de Estudiantes ***");
            System.out.println("""
                ** Menu ***
                1. Registrar estudiante
                2. Listar estudiantes
                3. Buscar estudiante
                4. Eliminar estudiante
                5. Actualizar datos
                6. Salir
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
                    registro.eliminarEstudiante(idEliminar);
                    break;
                case 5:
                    System.out.println("actualizar datos");
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el registro de estudiantes.");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
                    break;
            }
        }
    }
}
