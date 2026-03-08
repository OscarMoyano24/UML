public class Mainasociacion {

    public static void main(String[] args) {

        Profesor profesor = new Profesor("Carlos");
        Estudiantee estudiante = new Estudiantee("Ana");

        System.out.println("Profesor: " + profesor.nombre);
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("El profesor enseña al estudiante.");

    }

}