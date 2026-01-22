import java.util.Scanner;

public class Problem07 {
    /*
     * El programa ha de calcular la suma resultant d’afegir tots els nombres parells i restar tots els nombres senars. 
     * El punt final no forma part de la seqüència numèrica.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Una sola variable para todo el cálculo
        int resultado = 0;
        String numeros = sc.next();

        while (!numeros.equals(".")) {
            int numero = Integer.parseInt(numeros);
            if (numero % 2 == 0) {
                // Si es par, sumamos
                resultado += numero;
            } else {
                // Si es impar, restamos
                resultado -= numero;
            }

            numeros = sc.next();
        }

        // Imprimimos el resultado final
        System.out.println(resultado);

        sc.close();
    }
}
