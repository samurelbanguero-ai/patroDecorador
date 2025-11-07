package main;

import decoratorcafeteria.*;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static String cop(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return nf.format(valor);
    }
    
    // Método para formatear la descripción desde los componentes
    private static String construirDescripcion(List<String> componentes) {
        if (componentes.isEmpty()) {
            return "";
        }
        
        // El primer elemento es la bebida base
        StringBuilder descripcion = new StringBuilder(componentes.get(0));
        
        // Los demás son agregados
        if (componentes.size() > 1) {
            descripcion.append(" con ");
            for (int i = 1; i < componentes.size(); i++) {
                if (i > 1) {
                    descripcion.append(", ");
                }
                descripcion.append(componentes.get(i));
            }
        }
        
        return descripcion.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bebida bebida = null;

        System.out.println("=== CAFETERÍA DECORATOR ===");
        System.out.println("Seleccione su bebida base:");
        System.out.println("1. Espresso");
        System.out.println("2. Americano");
        System.out.println("3. Chocolate Caliente");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

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
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
            }
        }

        System.out.println("\n==== RESUMEN DE TU PEDIDO ====");
        String descripcion = construirDescripcion(bebida.listarComponentes());
        System.out.println("Bebida: " + descripcion);
        System.out.println("Total a pagar: " + cop(bebida.costo()));
        System.out.println("==============================");

        sc.close();
    }
}