import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ACT 1 Divisor de 10
        boolean seguir = true;
        while (seguir) {
            String num1 = sc.nextLine();
            if (num1.equals("*")) {
                seguir = false;
            } else {
                int num1A = Integer.parseInt(num1);
                if (num1A % 10 == 0) {
                    System.out.println("Si es");
                } else {
                    System.out.println("No es");
                }
            }
        }
        // ACT 2 suma de numero realizando conversion de Strings a Int
        seguir = true;
        while (seguir) {
            String num1 = sc.nextLine();
            if (num1.equals("f")) {
                seguir = false;
            } else {
                String num2 = sc.nextLine();
                if (num2.equals("f")) {
                    seguir = false;
                } else {
                    int num1A = Integer.parseInt(num1);
                    int num2A = Integer.parseInt(num2);
                    System.out.println(num2A + num1A);
                }
            }
        }
        sc.close();
    }
}