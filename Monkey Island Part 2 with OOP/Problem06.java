import java.util.Scanner;

public class Problem06 {
    /*
     * El programa ha de determinar si els parèntesis tanquen
     * correctament.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abiertos = 0;

        String parentesis = sc.next();
        // Mientras no sea el punto final
        while (!parentesis.equals(".")) {

            if (parentesis.equals("(")) {
                abiertos++; // Un paréntesis nuevo esperando cierre
            } else if (parentesis.equals(")")) {
                abiertos--; // Cerramos uno de los que estaban abiertos
            }
            parentesis = sc.next();
        }
        // Al final, 'abiertos' debe ser exactamente 0 (todos se cerraron)
        if (abiertos == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
