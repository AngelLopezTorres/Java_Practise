import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cordenadas");
        String palabra = sc.nextLine();
        
        int x = 0;
        int y = 0;
        int i = 0;
        while (i < palabra.length()) {
            if (palabra.charAt(i) == 'n') {
                y--;
            }
            if (palabra.charAt(i) == 's') {
                y++;
            }
            if (palabra.charAt(i) == 'w') {
                x--;
            }
            if (palabra.charAt(i) == 'e') {
                x++;
            }
            if (palabra.length() == '.') {
                return;
            }
            i++;
        }
        System.out.println("(" + x + "," + y + ")");
        sc.close();
    }
}