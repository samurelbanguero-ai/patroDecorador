// 📦 Paquete al que pertenece la clase.
// Esta clase se encuentra dentro del proyecto "decoratorcafeteria".
package decoratorcafeteria;

// ---------------------------------------------------------------
// 🔹 Clase CremaBatida
// ---------------------------------------------------------------
// Esta clase representa un "decorador concreto" dentro del patrón Decorator.
// Su función es agregar crema batida a una bebida ya existente, modificando
// su descripción y su costo.
public class CremaBatida extends AgregadoDecorator {

    // ---------------------------------------------------------------
    // 🔹 Constructor
    // ---------------------------------------------------------------
    // Recibe como parámetro una bebida (por ejemplo, Americano o ChocolateCaliente).
    // Luego llama al constructor de la clase padre AgregadoDecorator con "super(bebida)".
    //
    // Ejemplo:
    // Bebida bebida = new CremaBatida(new Americano());
    // Esto significa: “un café americano con crema batida”.
    public CremaBatida(Bebida bebida) {
        super(bebida);
    }

    // ---------------------------------------------------------------
    // 🔹 Método getDescripcion()
    // ---------------------------------------------------------------
    // Sobrescribe el método de la clase padre (AgregadoDecorator).
    // Primero obtiene la descripción de la bebida original y luego le agrega
    // el texto “+ crema batida”.
    //
    // Ejemplo:
    // Si la bebida era "Chocolate caliente", devuelve "Chocolate caliente + crema batida".
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + crema batida";
    }

    // ---------------------------------------------------------------
    // 🔹 Método costo()
    // ---------------------------------------------------------------
    // Sobrescribe también el método de la clase padre.
    // Llama al método costo() de la bebida base y le suma el valor adicional
    // de la crema batida (700 pesos).
    //
    // Ejemplo:
    // Si el Americano cuesta 5000, ahora cuesta 5700 (5000 + 700).
    @Override
    public double costo() {
        return bebida.costo() + 700;
    }
}
