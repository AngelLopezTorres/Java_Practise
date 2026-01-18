import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        /*
         * El programa ha d’imprimir la seqüència amb el nombre p a la posició adequada per tal
         * que tota la sortida estigui ordenada.
         */
        Scanner sc = new Scanner(System.in);
        int nummeter = sc.nextInt();
        String num;
        boolean punto = true;
        boolean termina = true;
        String guardar = " ";

        while (punto) {
            num = sc.next();
            if (num.equals(".")) {
                punto = false;
            } else {
                int num2 = Integer.parseInt(num);
                if (termina && nummeter <= num2) {
                    guardar += nummeter;
                    termina = false;
                }
                guardar += +num2 + " ";
            }
        }
        if (termina) {
            guardar += nummeter;
        }
        System.out.print(guardar);
        sc.close();
    }

}
