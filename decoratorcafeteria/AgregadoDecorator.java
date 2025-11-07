package decoratorcafeteria;

import java.util.List;

public abstract class AgregadoDecorator implements Bebida {
    protected Bebida bebida;
    
    public AgregadoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public abstract double costo();
    
    @Override
    public abstract List<String> listarComponentes();
}
