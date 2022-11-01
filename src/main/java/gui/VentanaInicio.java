package gui;
import controller.JuegoController;
import model.Juego;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaInicio extends Ventana{
    private JuegoController juegoController;
    private JLabel textoMenu;
    private JButton botonIniciarJuego;
    private JButton botonSalida;
    private JButton botonRegistrarJugador;
    private Juego juego;
    private model.Juego Juego;
    private JPanel panelBienvenida;



    public VentanaInicio(){
        super("BlackJava ");
        add(panelBienvenida);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public VentanaInicio(Juego juego) {
        super("Bienvenida");
        this.juego = juego;
        generarElementosVentana();
    }

    public VentanaInicio(String bienvenida) {
        super("Bienvenida");
        this.juego = juego;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonRegistrarJugador();
        generarBotonSalir();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "BlackJava";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 20, 30, 500, 30);
    }
    private void generarBotonRegistrarJugador() {
        String textoBoton = "Registrar Jugador";
        this.botonRegistrarJugador = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonRegistrarJugador);
        this.botonRegistrarJugador.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrarJugador) {
            VentanaRegistroJugador ventanaRegistrarJugador= new VentanaRegistroJugador(juego);
            //Cierra la ventana actual
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            JuegoController.almacenarDatos(this.juego);
            this.dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new VentanaInicio("BlackJava");
        frame.setVisible(true);

    }
}
