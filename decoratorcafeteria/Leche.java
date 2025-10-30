// 📦 Paquete donde se encuentra la clase.
// Todas las clases del sistema pertenecen al paquete "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase Leche
// ---------------------------------------------------------------
// Esta clase representa un "decorador concreto" dentro del patrón Decorator.
// Hereda de la clase abstracta AgregadoDecorator y agrega una nueva
// característica (leche) a cualquier bebida.
public class Leche extends AgregadoDecorator {

    // ---------------------------------------------------------------
    // 🔹 Constructor
    // ---------------------------------------------------------------
    // Recibe una bebida (por ejemplo, Espresso o Americano) como parámetro.
    // Llama al constructor de la clase padre con "super(bebida)" para
    // almacenar la bebida base que se va a decorar.
    //
    // Ejemplo de uso:
    // Bebida bebida = new Leche(new Espresso());
    // Esto significa: “Espresso con leche”.
    public Leche(Bebida bebida) {
        super(bebida);
    }

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Sobrescribe el método abstracto heredado de AgregadoDecorator.
    // Llama a la descripción de la bebida original y le agrega " + leche".
    //
    // Ejemplo:
    // Si la bebida base es “Americano” → devuelve “Americano + leche”.
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + leche";
    }

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // También sobrescribe el método abstracto de la clase padre.
    // Llama al costo de la bebida base y le suma el valor adicional de la leche.
    //
    // Ejemplo:
    // Si el Espresso cuesta 5500 → el resultado será 5500 + 800 = 6300.
    @Override
    public double costo() {
        return bebida.costo() + 800;
    }
}
