// 📦 Paquete al que pertenece la clase.
// Aquí se organiza dentro del proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase Americano
// ---------------------------------------------------------------
// Esta clase representa un tipo específico de bebida: el café americano.
// Implementa la interfaz "Bebida", lo que significa que debe definir
// los métodos que esa interfaz obliga: getDescripcion() y costo().
public class Americano implements Bebida {

    // ---------------------------------------------------------------
    // 🔹 Atributo o propiedad
    // ---------------------------------------------------------------
    // "descripcion" almacena el nombre de la bebida.
    // Se marca como "final" porque su valor no debe cambiar durante
    // la ejecución del programa.
    private final String descripcion = "Americano";

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Este método proviene de la interfaz "Bebida".
    // Devuelve el nombre o descripción de la bebida actual.
    // Aquí siempre retorna el texto "Americano".
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // También proviene de la interfaz "Bebida".
    // Devuelve el precio del café americano.
    // En este caso, el costo es de 5000 pesos.
    @Override
    public double costo() {
        return 5000;
    }
}
