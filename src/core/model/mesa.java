package core.model;

import java.util.List;

public class mesa {
    private List<Carta> cartasRepartidaMesa;
    private Mazo mazo;
    private Jugador jugador;

    public mesa(List<Carta> cartasRepartidaMesa){
        this.cartasRepartidaMesa=cartasRepartidaMesa;
    }


}
