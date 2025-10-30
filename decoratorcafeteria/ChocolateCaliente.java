// 📦 Indica el paquete donde se encuentra la clase.
// En este caso, pertenece al proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase ChocolateCaliente
// ---------------------------------------------------------------
// Esta clase representa una BEBIDA específica: el chocolate caliente.
// Implementa la interfaz "Bebida", lo que significa que debe definir
// los métodos que esa interfaz exige (getDescripcion y costo).
public class ChocolateCaliente implements Bebida {

    // ---------------------------------------------------------------
    // 🔹 Atributo o propiedad
    // ---------------------------------------------------------------
    // "descripcion" guarda el texto que identifica a la bebida.
    // Se usa "final" porque su valor no cambiará una vez asignado.
    private final String descripcion = "Chocolate caliente";

    // ---------------------------------------------------------------
    // 🔹 Método sobrescrito getDescripcion()
    // ---------------------------------------------------------------
    // Este método viene de la interfaz "Bebida".
    // Devuelve el texto que describe a la bebida.
    // En este caso, siempre retorna "Chocolate caliente".
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    // ---------------------------------------------------------------
    // 🔹 Método sobrescrito costo()
    // ---------------------------------------------------------------
    // También proviene de la interfaz "Bebida".
    // Devuelve el precio de la bebida.
    // Aquí el costo fijo del chocolate caliente es de $6200.
    @Override
    public double costo() {
        return 6200;
    }
}

