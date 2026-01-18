import java.util.Scanner;

public class Problem05 {
    /*
     * El programa ha de determinar la
     * longitud de la subseqüència més llarga de repeticions consecutives de la
     * primera paraula de la seqüència.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leemos la palabra objetivo (la primera de todas)
        String objetivo = sc.next();

        // Leemos la siguiente palabra para empezar la secuencia
        String palabra = sc.next();
        int contadorActual = 0;
        int maximoRécord = 0;
        // Bucle tradicional hasta encontrar el punto
        while (!palabra.equals(".")) {
            if (palabra.equals(objetivo)) {
                contadorActual++;
            } else {
                if (contadorActual > maximoRécord) {
                    maximoRécord = contadorActual;
                }
                // Reseteamos el contador para el siguiente grupo
                contadorActual = 0;
            }

            palabra = sc.next();
        }

        // Último chequeo por si el grupo más largo estaba al final
        if (contadorActual > maximoRécord) {
            maximoRécord = contadorActual;
        }

        System.out.println(maximoRécord);
        sc.close();
    }
}