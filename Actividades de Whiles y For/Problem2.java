import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;
        int numA;
        int numB;
        boolean salir = true;
        while (salir) {
            System.out.println("Cual será la operación");
            operacion = sc.nextLine();
            if (operacion.equals("sumar")) {
                System.out.println("Primer número");
                numA = sc.nextInt();
                System.out.println("segundo número");
                numB = sc.nextInt();
                System.out.println(numA + numB);
            } else if (operacion.equals("restar")) {
                System.out.println("Primer número");
                numA = sc.nextInt();
                System.out.println("segundo número");
                numB = sc.nextInt();
                System.out.println(numA - numB);
            } else if (operacion.equals("inversion")) {
                System.out.println("Primer número");
                numA = sc.nextInt();
                System.out.println(numA - (numA + numA));
            } else if (operacion.equals("aturar")) {
                salir = false;
            }
        }
        sc.close();
    }
}
