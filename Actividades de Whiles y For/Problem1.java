import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.nextLine();
        b = sc.nextLine();
        if (a.compareTo(b) < 0) {
            System.out.println(a + " < " + b);
        } else if (a.compareTo(b) > 0) {
            System.out.println(a + " > " + b);
        }
        sc.close();
    }
}
