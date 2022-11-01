package model;
import model.Jugador;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Jugador> jugadores;

public Juego(){
    this.jugadores=new ArrayList<Jugador>();
    public List<Jugador> getJugadores() {return jugadores;}

    public Jugador buscarJugadores(String nombreJugador) {
        Jugador estudiante = null;
        for (Jugador estudianteAux : this.jugadores) {
            if (estudianteAux.getNombre().equals(nombreJugador)) {
                estudiante = estudianteAux;
                break;
            }
        }
        return estudiante;
    }
  }

}
