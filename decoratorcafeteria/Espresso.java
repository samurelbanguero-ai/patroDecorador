// 📦 Paquete al que pertenece la clase.
// Forma parte del proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase Espresso
// ---------------------------------------------------------------
// Representa una bebida base, en este caso un "Espresso".
// Implementa la interfaz Bebida, lo que significa que debe definir
// los métodos getDescripcion() y costo().
// Es una de las bebidas simples a las que se le pueden agregar decoradores.
public class Espresso implements Bebida {

    // ---------------------------------------------------------------
    // 🔹 Atributo de descripción
    // ---------------------------------------------------------------
    // Almacena el nombre o descripción del tipo de bebida.
    // Se declara como "final" porque su valor no cambiará nunca:
    // un Espresso siempre se llamará "Espresso".
    private final String descripcion = "Espresso";

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Este método devuelve la descripción de la bebida.
    // Cumple el contrato definido en la interfaz Bebida.
    // Al ser un método simple, solo retorna el valor del atributo "descripcion".
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // Devuelve el costo base del Espresso.
    // El precio está definido como 5500.
    // Si más adelante se le agregan decoradores (como caramelo o crema batida),
    // el precio final aumentará sumando el valor adicional de cada uno.
    @Override
    public double costo() {
        return 5500;
    }
}
