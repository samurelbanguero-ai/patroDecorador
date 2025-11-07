
package decoratorcafeteria;
import java.util.List;


public class Soya extends AgregadoDecorator {
    public Soya(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public double costo() {
        return bebida.costo() + 900;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = bebida.listarComponentes();
        componentes.add("soya");
        return componentes;
    }
}