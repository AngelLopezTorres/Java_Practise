import java.util.Scanner;

public class Problem03 {
        /*
         * Donat un string p i una seqüència de strings ordenats lexicogràficament
         * (és a dir, representen un diccionari), escriu SI si p existeix en el
         * diccionari, o NO en cas contrari.
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String palabraBuscar = sc.next();// Leemos la palabra p que buscamos
      
        String palabra = sc.next();  // Leemos la primera palabra del diccionario
        boolean encontrado = false;
        
        while (!palabra.equals(".") && !encontrado) {// Mientras no sea el punto Y no hayamos encontrado la palabra
            if (palabra.compareTo(palabraBuscar) == 0) {
                encontrado = true;
            }
            palabra = sc.next();
        }

      
        if (encontrado) {  //Salida según el resultado
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
