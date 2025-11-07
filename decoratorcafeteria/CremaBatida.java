package decoratorcafeteria;

import java.util.List;

public class CremaBatida extends AgregadoDecorator {
    public CremaBatida(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public double costo() {
        return bebida.costo() + 700;
    }
    
    @Override
    public List<String> listarComponentes() {
        List<String> componentes = bebida.listarComponentes();
        componentes.add("crema batida");
        return componentes;
    }
}