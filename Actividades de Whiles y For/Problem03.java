import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int resultado = 0;
        
        while (y > 0) {
            resultado = resultado + x; // El resultado es 0 + lo que hayamos puesto en la entrada x;
            y--; // Cada vez que se sume el resultado a al valor que hayamos asignado y se le
                 // restará 1
        }
        System.out.println("Este es el resultado " + resultado);
        sc.close();
    }
}
