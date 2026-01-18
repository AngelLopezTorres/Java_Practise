public class Problem05 {
    public static int sumaDigitos(int numero){
        if (numero < 10) {
            return numero;
        } else {
            return sumaDigitos(numero % 10) + sumaDigitos(numero / 10);
        }
    }

    public static int reducciónDigitos(int numero){
        if (numero < 10) {
            return numero;
        } else {
            return reducciónDigitos(numero % 10) + reducciónDigitos(numero / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(reducciónDigitos(sumaDigitos(66)));
    }
}