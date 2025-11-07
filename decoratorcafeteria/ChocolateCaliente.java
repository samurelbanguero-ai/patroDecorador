package decoratorcafeteria;
import java.util.ArrayList;
import java.util.List;

public class ChocolateCaliente implements Bebida {
    @Override
    public double costo() {
        return 6000;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = new ArrayList<>();
        componentes.add("Chocolate Caliente");
        return componentes;
    }
}