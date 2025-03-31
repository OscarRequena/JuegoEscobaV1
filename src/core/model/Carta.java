package core.model;

public class Carta {
    private String nombreCarta;
    private String categoria;
    private int valorCarta;

    public Carta(String nombreCarta,String categoria, int valorCarta) {
        this.nombreCarta = nombreCarta;
        this.categoria = categoria;
        this.valorCarta = valorCarta;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }
    public int getValorCarta() {
        return valorCarta;
    }
    public String getCategoria(){
        return categoria;
    }

}
