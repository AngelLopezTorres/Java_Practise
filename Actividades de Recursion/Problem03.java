public class Problem03 {
    /*
     * Crea un metodo recursivo que reciba un String y devuelva la cadena invertida
     */
    public static String invertir(String s) {
        // Caso base: si la cadena está vacía, devolvemos una cadena vacía
        if (s.isEmpty()) {
            return "";
        }
        return s.charAt(s.length() - 1) + invertir(s.substring(0, s.length() - 1));
    }
    public static void  main(String[] args) {
        System.out.print(invertir("Java"));
    }
}
