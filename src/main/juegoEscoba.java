package main;

import core.input.Input;
import core.model.Jugador;
import core.model.Mazo;

import java.util.ArrayList;
import java.util.List;

public class juegoEscoba {

    public static void main(String[] args) {
        boolean noSeguirJugando = true;
        int contadorTurnos = 0;
        Input.bienvenido();
        do {
            contadorTurnos++;
            if (contadorTurnos == 3) {
                noSeguirJugando = false;
            }

            repartirCartas();


        }while(noSeguirJugando);
    }

    private static void repartirCartas() {
        List<Jugador> jugador = new ArrayList<>();
        jugador.add(new Jugador("1"));


    }
}
