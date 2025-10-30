// 📦 Paquete donde se encuentra la clase.
// Agrupa todas las clases relacionadas con el sistema de bebidas decoradas.
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase Soya
// ---------------------------------------------------------------
// Representa un "decorador concreto" dentro del patrón Decorator.
// Su función es agregar leche de soya a una bebida existente.
// Hereda de AgregadoDecorator, lo que le permite envolver un objeto Bebida.
public class Soya extends AgregadoDecorator {

    // ---------------------------------------------------------------
    // 🔹 Constructor
    // ---------------------------------------------------------------
    // Recibe un objeto del tipo Bebida (puede ser Americano, Espresso, etc.)
    // y lo pasa al constructor de la clase padre usando "super(bebida)".
    //
    // Ejemplo:
    // Bebida bebida = new Soya(new Espresso());
    // Esto significa: “Espresso con soya”.
    public Soya(Bebida bebida) {
        super(bebida);
    }

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Sobrescribe el método abstracto definido en AgregadoDecorator.
    // Llama al método getDescripcion() de la bebida base y agrega el texto " + soya".
    //
    // Ejemplo:
    // Si la bebida era "Americano", ahora se mostrará "Americano + soya".
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + soya";
    }

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // También sobrescribe el método abstracto de la clase AgregadoDecorator.
    // Calcula el precio sumando el costo de la bebida base con el valor adicional
    // de la leche de soya (900 pesos en este caso).
    //
    // Ejemplo:
    // Si el Espresso cuesta 5500, el resultado será 5500 + 900 = 6400.
    @Override
    public double costo() {
        return bebida.costo() + 900;
    }
}
