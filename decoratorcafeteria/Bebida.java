// 📦 Indica el paquete donde se encuentra esta interfaz.
// Aquí forma parte del proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Interfaz Bebida
// ---------------------------------------------------------------
// Esta interfaz define la estructura o "contrato" que todas las bebidas deben cumplir.
// Cualquier clase que implemente esta interfaz está obligada a tener
// una descripción y un costo.
public interface Bebida {

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Devuelve el nombre o la descripción de la bebida.
    // Ejemplo de uso:
    //   "Americano", "Chocolate caliente", "Capuchino con canela"
    String getDescripcion();

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // Devuelve el precio de la bebida.
    // Puede ser un precio fijo (como 5000 para un Americano)
    // o calculado dinámicamente si se agregan decoradores (como crema o canela).
    double costo();
}
