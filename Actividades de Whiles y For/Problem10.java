import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Usamos sc.hasNext() para leer mientras haya entrada
        while (sc.hasNext()) {
            String input = sc.next();
            
            // Si el usuario introduce un punto, salimos del bucle
            if (input.equals(".")) {
                break;
            }

                int n = Integer.parseInt(input);
                int p = n / 7;
                boolean encontrado = true;

                   while (encontrado && p >= 0) {
                    int restante = n - (7 * p);
                    
                    // Si lo que sobra se puede pagar exactamente con sellos de 4
                    if (restante % 4 == 0) {
                        int q = restante / 4;
                        System.out.println(p + " " + q);
                        encontrado = false;
                    }
                    p--;
                }
        }
        sc.close();
    }
}