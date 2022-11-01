package model;

import model.Carta;

public class Jugador {
    private String nombreJugador;
    private Carta[] mano = new Carta[10];
    private int numCartas;

    public Jugador(String nombre){
        this.nombreJugador = nombre;
        this.manoVacia();
    }
    public String getNombre() {
        return this.nombreJugador;
    }
    public void setNombre() {
        this.nombreJugador=nombreJugador;
    }
    public void manoVacia(){
        for (int c = 0; c < 10; c++){
            this.mano[c] = null;
        }
        this.numCartas = 0;
    }

    public boolean addCarta(Carta aCarta){
        if (this.numCartas == 10){
            System.err.printf("%s's ya tienes 10 cartas en mano; " +
                    "no puedes agregar otra\n", this.nombreJugador);
            System.exit(1);
        }
        this.mano[this.numCartas] = aCarta;
        this.numCartas++;

        return (this.getSumMano() <= 21);
    }

    public int getSumMano(){
        int sumMano = 0;
        int numCarta;
        int numAces = 0;

        for (int c = 0; c < this.numCartas; c++){
            numCarta = this.mano[c].getNumero();

            if (numCarta == 1){
                numAces++;
                sumMano += 11;
            } else if (numCarta > 10) {
                sumMano += 10;
            } else {
                sumMano += numCarta;
            }
        }
        while (sumMano > 21 && numAces > 0){
            sumMano -= 10;
            numAces--;
        }

        return sumMano;
    }

    public void mostrarMano(boolean mostrarPrimeraCarta){

        System.out.printf("%s's cartas:\n", this.nombreJugador);
        for (int c = 0; c < this.numCartas; c++){
            if (c == 0 && !mostrarPrimeraCarta){
                System.out.println("  [hidden]");
            }else {
                System.out.printf("%s's\n", this.mano[c].toString());
            }
        }

    }

}