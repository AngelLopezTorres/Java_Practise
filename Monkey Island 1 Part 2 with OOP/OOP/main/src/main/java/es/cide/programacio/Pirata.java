//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 4/11/2025
package es.cide.programacio;
import java.util.Random;

public class Pirata {
    //Atributos
    private final String[] INSULTOPIRATA;
    private final boolean[] INSREPETIDO;
    private final String[] RESPINDICE;
    private int vida;
    private int numPreg; //Aquí se guardará el numero de la pregunta que utilizaremos para luego poder usarla en el método replica replica()
    private final int nomRnd;
    private final String[] INSULTOS = {
        "¡Luchas como un granjero!", //1 (0)
        "Mi pañuelo limpiaría mejor el suelo que tú la cubierta.", // 2(1)
        "¡He hablado con simios más educados que tú!", // 3(2)
        "¡Eres el peor pirata que haya visto!", // 4(3)
        "¡Mi espada es más famosa que tú!", // 5(4)
        "¡Nadie me ha sacado sangre jamás, y menos un don nadie como tú!", //6 (5)
        "¡Tienes los modales de un mendigo!", // 7(6)
        "¡Tu madre se vistió con un mono!", // 8(7)
        "¡Eres tan feo que harías vomitar a un cerdo!", // 9 (8)
        "¡He oído que eres un cobarde despreciable!",// 10 (9)
        "Serás recordado como el bufón de la isla." //11 (10)
    };

    private final String[] RESPUESTAS = { //Strings de las respuestas para el método réplica.
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

    private final String[] NOM = {
        "Largo LaGrande", "Carla", "Murray", "Captain Trent", "Guybrush Threepwood",
        "Haggis McMutton", "Kate Capsize", "Captain Smirk", "Pegnose Pete",
        "Captain Dread", "Cutthroat Bill","Mad Marty", "Rusty Anchor Jack", "Bloody Bonnie",
        "One-Eyed Wallace", "Sully 'El Tuerto'", "Marina la Roja",
        "Old Barnaby", "Captain Fishhook", "Silverbelly Sam"
    };
    public Pirata() { //Constructor sin parámetros
        Random rnd = new Random();
        INSULTOPIRATA = new String[3]; // Declaramos el array de insultos que tendrá el pirata
        RESPINDICE = new String[3]; //Declaramos el array que contendrá cada respuesta correspondiente que se genere con el pirata para poder usarlo en el metodo replica()
        nomRnd = rnd.nextInt(NOM.length); // Genera el random de los nombres
        INSREPETIDO = new boolean[INSULTOS.length]; //Creamos el booleano del tamaño de los insultos para que no se repitan
        vida = rnd.nextInt(1, 4); //Creamos la vida que tendrá un valor entre 1,3  
        int i = 0; //Declaramos esta variable dentro del constructor porque es algo que solo usaremos aquí y fuera del constructor no tiene uso
        while (i < 3) {
            int insRnd = rnd.nextInt(INSULTOS.length); //Delcaramos los insultos random aquí dentro también porque para llamar después a cada pirata que tenga el pirata no usaremos insRnd y solo lo usaremos para asignarle el insulto de los 10 que tenemos y lo ponemos en dentro del while para que genere un insulto cada vez
            if (!INSREPETIDO[insRnd]) { // El array booleano mirará si el número que ha salido del insRnd no ha salido y entrará en el if
                INSULTOPIRATA[i] = INSULTOS[insRnd]; //Los 3 insultos pirata (0,1,2) se rellenaran cada uno con un insulto del String del insultos y el insulto será el num que se haya generado del insRnd
                INSREPETIDO[insRnd] = true; //Entonces se marcará como true el insulto
                RESPINDICE[i] = RESPUESTAS[insRnd]; //Asignara al array de respIndice 0,1,2 la respectiva respuesta de cada insulto
                i++;
            }
        }

    }

    // SETTER Y GETTERS que usaremos
    public int getVida() { //Este getVida es importante a la hora de hacer el juego en el main para recoger la vida del pirata
        return vida;
    }

    // Métodos
    public void insultar() { //El pirata insulta al heroe
        Random rnd = new Random();
        numPreg = rnd.nextInt(3); // Generamos un numero aleatorio que se guardará en la variable numpreg
        if (vida == 1) { //If que en caso de que el pirata que se genere solo tenga 1 vida, muestre la palabra "batalla" y no "batallas"
            System.out.println("El pirata " + NOM[nomRnd] + " insulta: " + INSULTOPIRATA[numPreg] + " ¡Para avanzar tendrás que ganarme " + vida + " batalla!\n"); //Muestra el nombre del pirata, el insulto y el numero de vidas
        } else { //Si tiene más de 1 vida lo mostrará plural
            System.out.println("El pirata " + NOM[nomRnd] + " insulta: " + INSULTOPIRATA[numPreg] + " ¡Para avanzar tendrás que ganarme " + vida + " batallas!\n");
        }
    }

    public boolean replica(String respuestaUsuario) { // Cuando llamemos a este método le pasaremos un parámetro un String que será la respuesta del usuario
        int respuestaUsuarioInt = Integer.parseInt(respuestaUsuario); // Creamos una variable int para poder utilizar el string y hacer la comparación entre arrays
        if (RESPUESTAS[respuestaUsuarioInt - 1].equals(RESPINDICE[numPreg])) { // En caso de que la respuesta del usuario -1 para que coincida en la respuesta del usuario (Ya que el responde del 1-10 y no del 0-10) sea igual al array de respIndice (que contiene la respuesta correspondiente por cada insulto) y dentro de array le pasamos el numPreg para que la respuesta a comparar sea la de ese insulto que muestre al heroe
            System.out.println("-------------------------------------------Respuesta Pirata--------------------------------------------------");
            System.out.println("\n¡Como osas hacerme daño, pagarás por esto!\n"); //Si se cumple entonces mostrará esto
            System.out.println("-------------------------------------------------------------------------------------------------------------");

            return true; // devolverá un true
        } else { // Si ha fallado
            System.out.println("-------------------------------------------Respuesta Pirata--------------------------------------------------");
            System.out.println("\nNo has podido ni rozarme, ¡Esperaba que fuese un duelo memorable!\n"); //Mostrará esto
            System.out.println("-------------------------------------------------------------------------------------------------------------");

            return false; // Devolverá un false
        }
    }

    public boolean vida() { // Restar vida
        boolean seguir; // Creamos un booleano seguir
        vida--; // Le restamos la vida
        seguir = vida > 0; // Le decimos que será true mientras vida sea mayor que 0;
        if (vida == 0) {
            System.out.println("---------------------------------------PIRATA DERROTADO----------------------------------------------------"); //Mostrará esto
            System.out.println("Me has derrotado, los demás piratas no te lo dejarán tan fácil. Necesitarás toda la suerte que puedas.\n"); //Mostrará esto
        }
        return seguir; // Y devuelve el valor de seguir que puede ser true or false.
    }
}
