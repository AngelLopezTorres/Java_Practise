//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 4/11/2025
package es.cide.programacio;

import java.util.Scanner;

public class Heroi {
    // Atributos
    private final String NOM;
    private final Scanner SC = new Scanner(System.in); // Creamos el scanner para recoger respuesta
    private int vida;
    private final String[] RESPUESTAS = {
            "1. Qué apropiado, tú peleas como una vaca.",
            "2. Así es, si lo usas para limpiarte la lengua.",
            "3. Me alegra que hallaras a alguien que entendiera tus problemas.",
            "4. Al menos lo has visto.",
            "5. Sí, pero tú la necesitas para sentirte importante.",
            "6. ¿Tan rápido corres antes de que empiece el combate?",
            "7. Quería estar a la altura de tu compañía.",
            "8. Me alegra que la recuerdes de tus visitas al zoológico.",
            "9. Entonces será por eso que siempre te veo solo.",
            "10. Qué curioso, yo oí lo mismo de ti, pero de una fuente más fiable.",
            "11. Más triste es ser derrotado por el, y que todos lo recuerden"
    };

    public Heroi(String nombre) { // Constructor de Heroi con un parametro String nombre que se deberá de declarar a la hora de crear el objeto Illa
        this.vida = 10; // Declaramos la vida que tendrá el heroe
        this.NOM = nombre; // referencia al atributo nom
    }

    // Getters and Setters que usaremos
    public String getNom() {
        return NOM;
    }

    public int getVida() { // Este getVida es importante a la hora de hacer el juego en el main
        return vida;
    }

    // Metodos
    public String defensar() { // Metodo defensar() que mostrará todos los insultos que debe de devolver un String para la replica con el pirata
        for (String respuesta : RESPUESTAS) { // Muestra todas las respuestas
            System.out.println(respuesta);
        }
        System.out.print("\nElige tu respuesta heroe " + NOM + ": "); 
        String respuesta = SC.nextLine(); //Introduce la respuesta

        int respuestaInt = Integer.parseInt(respuesta); //Lo paso a int para mirar si realmente no ha repetido  
        while (respuestaInt <= 0 || respuestaInt > RESPUESTAS.length) { //Mientras lo que haya respondido sea menor al array y a 0 este while no se realizará
            System.out.print("\nEs un número no válido heroe " + NOM + " vuelve a elegir: "); //Te dice que vuelvas a introducir un número
            respuesta = SC.nextLine(); //Vuelve a guardar la respuesta
            respuestaInt = Integer.parseInt(respuesta); // Y la pasa a int para ver si es mayor que 0 y menor que el array
        }

        return respuesta; //Devuelve la respuesta String
    }

    public boolean vida() { // Metodo de restar vida
        boolean seguir;
        vida--; // Resta la vida
        seguir = vida > 0; // Seguir será true mientras vida sea mayor que 0
        // En caso de que sea 0 será false
        System.out.println("Vida del heroe " + NOM + ": " + vida); // Cada vez que se llame al metodo vida del heroe mostrará este mensaje
        return seguir; // Devolverá si es true or false
    }
}