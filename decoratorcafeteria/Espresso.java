package decoratorcafeteria;

import java.util.ArrayList;
import java.util.List;

public class Espresso implements Bebida {
    @Override
    public double costo() {
        return 5500;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = new ArrayList<>();
        componentes.add("Espresso");
        return componentes;
    }
}