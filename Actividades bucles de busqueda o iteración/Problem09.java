import java.util.Scanner;

public class Problem09 {
    /*
     * El programa ha d’imprimir la suma dels nombres múltiples
     * de 3 menys la suma dels nombres múltiples de 5. Fixat-hi que un nombre
     * pot ser múltiple de 3 i 5 alhora.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numIntroducir = sc.next();
        int mult3 = 0; // Variable para todos los multiplos de 3
        int mult5 = 0; // Variable para todos los multiplos de 5

        while (!numIntroducir.equals(".")) {// El bucle se detiene con el centinela (en este caso el punto '.')
            int numero = Integer.parseInt(numIntroducir);
            if (numero % 3 == 0) {
                mult3 += numero;
            }
            if (numero % 5 == 0) {
                mult5 += numero;
            }
            numIntroducir = sc.next();
        }
        System.out.println(mult3 - mult5);
        sc.close();
    }
}
