import java.util.List;

public class Dealer {
    private Mazo mazo;
    private List<Carta> cartas;

  //  baraja ---> i = 0 --- > jugador o dealer


    public Dealer(Mazo mazo) {
        this.mazo = mazo;
    }
    public void agregarCartas(Carta carta){
        cartas.add(carta);
    }
}
