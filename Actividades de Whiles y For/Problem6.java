import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Validador de Tarjetas (Algoritmo de Luhn)
        // Usamos una bandera para controlar el bucle principal
        boolean continuar = true;

        while (continuar && sc.hasNext()) {
            String tarjeta = sc.next();

            if (tarjeta.equals(".") || tarjeta.equals("0")) {
                continuar = false;
            } else {
                // Solo ejecutamos la lógica si 'continuar' sigue siendo true
                int sumaTotal = 0;
                boolean duplicar = false;

                for (int i = tarjeta.length() - 1; i >= 0; i--) {
                    int n = Character.getNumericValue(tarjeta.charAt(i));

                    if (duplicar) {
                        n *= 2;
                        if (n > 9) {
                            n -= 9;
                        }
                    }

                    sumaTotal += n;
                    duplicar = !duplicar;
                }

                if (sumaTotal % 10 == 0) {
                    System.out.println("VÁLIDO");
                } else {
                    System.out.println("NO VÁLIDO");
                }
            }
        }
        sc.close();
    }
}