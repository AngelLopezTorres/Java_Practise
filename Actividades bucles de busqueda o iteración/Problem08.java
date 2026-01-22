import java.util.Scanner;

public class Problem08 {
    /*
     * llegeixi una seqüència d’enters acabada amb
     * un punt i determini si els nombres alternen en paritat (parell, senar,
     * parell, senar... o al revés)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        int numAnterior = Integer.parseInt(num);
        boolean alterna = true;
        num = sc.next();

        while (!num.equals(".") && alterna) {
            int numActual = Integer.parseInt(num);

            // Comprobamos si no se llegase a cumplir
            if (numActual % 2 == numAnterior % 2) {
                alterna = false;
            }

            numAnterior = numActual; // El actual pasa a ser el anterior para la siguiente vuelta
            num = sc.next();
        }

        if (alterna) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }

}
