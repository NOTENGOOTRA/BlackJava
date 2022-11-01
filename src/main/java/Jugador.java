
import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> cartas= new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    public void agregarCartas(Carta carta){
        cartas.add(carta);
    }
    public void mostrarMano(){
        for (int i = 0; i < cartas.size() ; i++) {
            System.out.println(cartas.get(i));

        }
    }
}
