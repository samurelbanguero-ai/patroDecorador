package decoratorcafeteria;
import java.util.List;


public class Caramelo extends AgregadoDecorator {
    public Caramelo(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public double costo() {
        return bebida.costo() + 1000;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = bebida.listarComponentes();
        componentes.add("caramelo");
        return componentes;
    }
}