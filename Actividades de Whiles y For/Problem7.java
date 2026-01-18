import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase que termine con un punto ");
        String palabra = sc.nextLine();
        
        String palabra2 = palabra.toLowerCase();
        int a = 0;
        int i = 0;
        boolean keep = true;
        while (keep) {
            if (palabra2.charAt(i) == 'a') {
                a++;
            }
            if (palabra2.charAt(i) == '.') {
                keep = false;
            }

            i++;
        }
        System.out.println("contiene: " + a + " 'a'");
        sc.close();
    }
}
