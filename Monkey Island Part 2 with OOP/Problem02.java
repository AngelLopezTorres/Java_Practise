import java.util.Scanner;

public class Problem02 {
    /*
     El programa ha d’imprimir "SI" si d és un dígit de n, 
     i "NO" en cas contrari.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nummirar = sc.nextInt();
        boolean seguir = true;
        while (seguir && nummirar > 0) {
            if (num == nummirar % 10) {
                seguir = false;
            }
            nummirar = nummirar / 10;
        }

        if (!seguir) {
            System.out.println("SÍ");
        } else{
            System.out.println("NO");

        }
        sc.close();
    }
}