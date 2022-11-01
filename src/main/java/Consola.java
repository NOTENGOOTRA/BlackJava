

public class Consola {
    public static void main(String[] args) {

        Mazo mazo1 = new Mazo();
        mazo1.crearMazo();
        mazo1.mostrarMazo();

        System.out.println("mazo creado");

        mazo1.shuffle();    // revolver mazo con metodo Collection
        mazo1.mostrarMazo();
        System.out.println("Aca empiezan cartas de Arturo!!!!!");


        Dealer dealer1 = new Dealer(mazo1);
        Jugador jugador1 = new Jugador("Arturo");
        jugador1.agregarCartas(mazo1.repartirCarta());
        dealer1.agregarCartas(mazo1.repartirCarta());
        jugador1.agregarCartas(mazo1.repartirCarta());

        jugador1.mostrarMano();
        System.out.println("Hasta aqui cartas de jugador!!!!!");
        mazo1.mostrarMazo();

    }


}