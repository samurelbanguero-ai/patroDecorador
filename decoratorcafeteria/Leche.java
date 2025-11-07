package decoratorcafeteria;

import java.util.List;

public class Leche extends AgregadoDecorator {
    public Leche(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public double costo() {
        return bebida.costo() + 800;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = bebida.listarComponentes();
        componentes.add("leche");
        return componentes;
    }
}