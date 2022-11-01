package controller;

public class JuegoController {
    public static Juego cargaMasivaDatos(Juego juego) {
    GestorDatos.leerArchivoJugadores(juego, "jugadores.txt");
    return juego;
}

    public static void almacenarDatos(Juego juego) {
        GestorDatos.registrarDatos(juego.getJugadores(), "jugadores.txt");
    }
}
