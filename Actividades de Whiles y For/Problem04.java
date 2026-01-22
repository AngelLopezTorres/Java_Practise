import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();
        int n = 0;
        
        if (dig == 0) {
            n = 1;
        } else if (dig < 0) {
            System.out.println("Número no valido");
        } else {
            while (dig > 0) {
                dig = dig / 10;
                n = n + 1;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
