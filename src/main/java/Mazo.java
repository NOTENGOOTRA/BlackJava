import java.util.*;

public class Mazo {


    private List <Carta> misCartas = new ArrayList<>();

    public Mazo() {

    }
    public void shuffle(){
        Collections.shuffle(misCartas);

    }

    public List<Carta> crearMazo(){
        String[] pintas={"Corazon","Trebol","Pica","Diamante"};
        String[] nombreValor={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Jota","Quina","Kaiser"};
        int[] valores={1,2,3,4,5,6,7,8,9,10,10,10,10};

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 13 ; j++) {
                Carta carta1 = new Carta(pintas[i],nombreValor[j],valores[j]);
                misCartas.add(carta1);



            }

        }
        return misCartas;


    }

    public void mostrarMazo(){
        for (int i = 0; i < misCartas.size() ; i++) {
            System.out.println(misCartas.get(i));

        }


    }
    public Carta repartirCarta() {
        Carta cartas = new Carta();
        cartas = misCartas.get(0);
        misCartas.remove(0);

        return cartas;
    }
}
