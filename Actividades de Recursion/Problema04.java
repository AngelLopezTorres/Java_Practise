public class Problema04 {
    /*
     * Contar números a partir de un caso recursivo
     */
    public static int contarNumeros(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarNumeros(numero / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(contarNumeros(77720));
    }

}
