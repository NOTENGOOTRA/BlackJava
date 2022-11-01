package model;

public class Carta {
    private String pinta ; //enum
    private String miNumero;

    private int valores;

    public Carta(String pinta , String valor, int valores) {   //CONSTRUCTOR, INCIIALIZAMOS
        this.pinta = pinta;
        this.miNumero = valor;
        this.valores = valores;
    }
    public Carta(){

    }


    public String  getMiPinta() {
        return pinta;
    }

    public String getMiNumero() {
        return miNumero;
    }
    public int getValores() {
        return valores;
    }
    public void setValores(String color) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        return pinta +" "+miNumero +" "+valores;
    }

    /*public String toString() {
       String numeroString = "Failed";

       switch(this.miNumero) {
           case 1:
               numeroString = "A";
               break;
           case 2:
               numeroString = "Dos";
               break;
           case 3:
               numeroString = "Tres";
               break;
           case 4:
               numeroString = "Cuatro";
               break;
           case 5:
               numeroString = "Cinco";
               break;
           case 6:
               numeroString = "Seis";
               break;
           case 7:
               numeroString = "Siete";
               break;
           case 8:
               numeroString = "Ocho";
               break;
           case 9:
               numeroString = "Nueve";
               break;
           case 10:
               numeroString = "Diez";
               break;
           case 11:
               numeroString = "J";
               break;
           case 12:
               numeroString = "Q";
               break;
           case 13:
               numeroString = "K";
               break;


       }
       return numeroString + " " + "de" + " " + pinta.toString();
    }*/
}
