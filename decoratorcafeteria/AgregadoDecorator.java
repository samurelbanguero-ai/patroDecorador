// 📦 Indica el paquete al que pertenece esta clase.
// En este caso, está dentro del proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase abstracta AgregadoDecorator
// ---------------------------------------------------------------
// Esta clase representa un "decorador" general dentro del patrón Decorator.
// Su función es permitir agregar nuevas características o comportamientos
// a las bebidas (como leche, canela o crema batida) sin cambiar su código original.
//
// Extiende o implementa la interfaz "Bebida", por eso todos los decoradores
// son tratados como si también fueran bebidas.
public abstract class AgregadoDecorator implements Bebida {

    // ---------------------------------------------------------------
    // 🔹 Atributo protegido
    // ---------------------------------------------------------------
    // "bebida" es una referencia a un objeto del tipo Bebida.
    // Este atributo permite "envolver" una bebida dentro de otra,
    // lo que es la base del patrón Decorator.
    protected Bebida bebida;

    // ---------------------------------------------------------------
    // 🔹 Constructor
    // ---------------------------------------------------------------
    // El constructor recibe como parámetro una bebida que será "decorada".
    // Por ejemplo, podríamos pasar un objeto de tipo ChocolateCaliente.
    //
    // Ejemplo:
    // Bebida miBebida = new CremaBatida(new ChocolateCaliente());
    public AgregadoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    // ---------------------------------------------------------------
    // 🔹 Métodos abstractos
    // ---------------------------------------------------------------
    // Estos métodos se declaran, pero no se implementan aquí.
    // Las clases hijas (como CremaBatida o Canela) deberán definir
    // cómo se comportan exactamente.
    //
    // getDescripcion() -> devuelve el texto que describe la bebida con su agregado.
    // costo() -> devuelve el precio total (bebida base + agregado).
    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double costo();
}
