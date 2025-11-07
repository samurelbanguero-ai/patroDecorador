package decoratorcafeteria;
import java.util.ArrayList;
import java.util.List;

public class Americano implements Bebida {
    @Override
    public double costo() {
        return 5000;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = new ArrayList<>();
        componentes.add("Americano");
        return componentes;
    }
}