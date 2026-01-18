import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nummeter = sc.nextInt(); // El número a insertar
        String guardar = "";
        boolean ultimo = true;

        // Leemos el primer elemento de la secuencia
        String nums = sc.next();

        while (!nums.equals(".")) {
            int num2 = Integer.parseInt(nums);
            if (ultimo && nummeter <= num2) {   // Si el número a insertar es menor o igual al actual, lo ponemos delante
                guardar += nummeter + " ";
                ultimo = false;
            }
            guardar += num2 + " ";  // Añadimos el número actual de la secuencia
            nums = sc.next(); // Leemos el siguiente
        }


        if (ultimo) {// Si terminamos y nummeter era el más grande de todos
            guardar += nummeter;
        }

        // Imprimimos el resultado final sin espacios extra
        System.out.println(guardar);
        sc.close();
    }
}