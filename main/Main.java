// 📦 Paquete principal donde se ejecuta el programa
package main;

// Se importan todas las clases del paquete "decoratorcafeteria",
// donde se encuentran las bebidas y los agregados.
import decoratorcafeteria.*;

// Se importan clases útiles para formatear precios y leer datos.
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    // ---------------------------------------------------------------
    // 🔹 Método auxiliar: formatear precios en pesos colombianos (COP)
    // ---------------------------------------------------------------
    // Este método recibe un valor numérico (double) y lo convierte
    // en un formato de moneda local de Colombia, por ejemplo: "$7.500,00".
    // Se utiliza la clase NumberFormat y el Locale "es_CO" (español - Colombia).
    private static String cop(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return nf.format(valor);
    }

    // ---------------------------------------------------------------
    // 🔹 Método principal main()
    // ---------------------------------------------------------------
    // Aquí comienza la ejecución del programa.
    // Es el punto de entrada de la aplicación.
    public static void main(String[] args) {

        // ---------------------------------------------------------------
        // 1️⃣ Crear el lector de entrada (Scanner) para leer datos del usuario.
        // ---------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        Bebida bebida = null; // Esta variable guardará la bebida seleccionada.

        // ---------------------------------------------------------------
        // 2️⃣ Mostrar menú principal de bebidas base.
        // ---------------------------------------------------------------
        System.out.println("=== CAFETERÍA DECORATOR ===");
        System.out.println("Seleccione su bebida base:");
        System.out.println("1. Espresso");
        System.out.println("2. Americano");
        System.out.println("3. Chocolate Caliente");
        System.out.print("Opción: ");

        // Leer la opción que el usuario selecciona
        int opcion = sc.nextInt();

        // ---------------------------------------------------------------
        // 3️⃣ Crear la bebida base según la opción elegida.
        // ---------------------------------------------------------------
        switch (opcion) {
            case 1:
                bebida = new Espresso();
                break;
            case 2:
                bebida = new Americano();
                break;
            case 3:
                bebida = new ChocolateCaliente();
                break;
            default:
                System.out.println("Opción no válida. Se seleccionará Espresso por defecto.");
                bebida = new Espresso();
        }

        // ---------------------------------------------------------------
        // 4️⃣ Mostrar menú de agregados (decoradores).
        // ---------------------------------------------------------------
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nAgregue complementos:");
            System.out.println("1. Leche (+$800)");
            System.out.println("2. Soya (+$900)");
            System.out.println("3. Caramelo (+$1000)");
            System.out.println("4. Crema Batida (+$700)");
            System.out.println("5. Finalizar pedido");
            System.out.print("Opción: ");
            int extra = sc.nextInt();

            // Según la opción seleccionada, se agrega un decorador a la bebida
            switch (extra) {
                case 1:
                    bebida = new Leche(bebida);
                    break;
                case 2:
                    bebida = new Soya(bebida);
                    break;
                case 3:
                    bebida = new Caramelo(bebida);
                    break;
                case 4:
                    bebida = new CremaBatida(bebida);
                    break;
                case 5:
                    continuar = false; // Sale del bucle
                    break;
                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
            }
        }

        // ---------------------------------------------------------------
        // 5️⃣ Mostrar el resultado final del pedido.
        // ---------------------------------------------------------------
        System.out.println("\n==== RESUMEN DE TU PEDIDO ====");
        System.out.println("Bebida: " + bebida.getDescripcion()); // Muestra descripción completa
        System.out.println("Total a pagar: " + cop(bebida.costo())); // Muestra precio formateado
        System.out.println("==============================");

        // Cerrar el Scanner para liberar recursos.
        sc.close();
    }
}
