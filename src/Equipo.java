public class Equipo {

    Jugador jugador;

    public Equipo(Jugador jugador) {
        this.jugador = jugador;
    }

    public void mostrarJugador() {
        System.out.println("Jugador del equipo: " + jugador.nombre);
    }

}