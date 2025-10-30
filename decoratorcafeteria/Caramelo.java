// 📦 Paquete al que pertenece la clase.
// Está dentro del proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase Caramelo
// ---------------------------------------------------------------
// Esta clase representa un "agregado" o "decorador concreto".
// Extiende la clase abstracta AgregadoDecorator, lo que significa que
// agrega una nueva característica a una bebida (en este caso, caramelo).
public class Caramelo extends AgregadoDecorator {

    // ---------------------------------------------------------------
    // 🔹 Constructor
    // ---------------------------------------------------------------
    // Recibe como parámetro una bebida (por ejemplo, un Americano o un ChocolateCaliente).
    // Luego, pasa ese objeto al constructor de la clase padre (AgregadoDecorator)
    // para que quede "envuelto" dentro del decorador.
    //
    // Ejemplo:
    // Bebida miBebida = new Caramelo(new Americano());
    // Significa que a un Americano se le añadió caramelo.
    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Sobrescribe el método abstracto heredado de AgregadoDecorator.
    // Llama al método getDescripcion() de la bebida original y le agrega la frase “+ caramelo”.
    //
    // Por ejemplo:
    // Si la bebida base era “Americano” → devuelve “Americano + caramelo”.
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + caramelo";
    }

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // También sobrescribe el método abstracto heredado de AgregadoDecorator.
    // Llama al método costo() de la bebida base y le suma el precio adicional del caramelo.
    //
    // Por ejemplo:
    // Si un Americano cuesta 5000 → ahora cuesta 6000 (5000 + 1000).
    @Override
    public double costo() {
        return bebida.costo() + 1000;
    }
}
