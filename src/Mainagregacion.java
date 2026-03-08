public class Mainagregacion {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Carlos");

        Equipo equipo = new Equipo(jugador1);

        equipo.mostrarJugador();

    }

}