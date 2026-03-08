import java.util.Scanner;

public class Mainherencia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        System.out.print("Nombre: ");
        estudiante.nombre = teclado.nextLine();

        System.out.print("Edad: ");
        estudiante.edad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Carrera: ");
        estudiante.carrera = teclado.nextLine();

        estudiante.mostrarDatos();
        estudiante.mostrarCarrera();
    }
}
