import java.util.Scanner;

public class Multometro {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    byte cantidadConductores = 5;
    int i = 1;
    // Ciclo mientras para validar que se ingresaron los 5 conductores
    // Contador i = inicializado en 1 para ir aumentando cada que acabe el ciclo
        while (i < cantidadConductores) {
            // Preguntar nombre al usuario
            // NO SE XQ CUANDO I TOMA EL VALOR DE 2 SE IMPRIME LAS SIGUIENTES 3 LINEAS Y TIRA ERROR.
            System.out.println("Ingrese nombre: ");
            String nombre = input.nextLine();
            System.out.println("Ingrese velocidad: ");
            int velocidad = input.nextInt();
            // If para verificar si la velocidad fue excedida al limite o no
            if (velocidad > 60) {
                double multa = (velocidad - 60) * 2.5;
                int multaEntera = (int) multa;
                System.out.println(nombre + " excediste la velocidad maxima, debes pagar $" + multaEntera + " de multa.");
            }else {
                System.out.println("Felicidades " + nombre + ", no excediste la velocidad crack.");
            }
            // Sumador
            i += 1;
        }
        input.close();
    }
}
