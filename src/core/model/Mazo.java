package core.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mazo {
    private List<Carta> baraja;

    public Mazo(){
        baraja = new ArrayList<>();
        String[] listaCategoria = {"oro","espadas","copas","bastos"};
        String[] nombres = {"As","dos","tres", "cuatro","cinco","seis", "siete","sota","caballo","rey"};
        int[] valores ={1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < listaCategoria.length;i++){
            for (int j = 0; j < valores.length;j++){
                baraja.add(new Carta(nombres[j], listaCategoria[i],valores[j]));
            }
        }
    }




}
