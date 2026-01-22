//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;
import java.util.Random;

public class Illa {
    //Atributos
    private Pirata[] numPiratas;
    private String nomIsla;
    private final String[] NOMPIRATES = { 
    "Ozzie Mandrill", "Stan S. Stanman","Rapp Scallion",
    "Meathook", "Wally","Piggott", 
    };
    public Illa(String[] insultoPirata, String[] respuestasHeroi) { //Constructor de Illa con los parametros que le pasaremos a los piratas para que tengan los insultos y las respuestas
        Random rnd = new Random();
        nomIsla = "Monkey Island"; // Hacemos que la isla se llame Monkey Island
        numPiratas = new Pirata[rnd.nextInt(3,8)]; //Genera un numero de piratas que empieza en el 3 y será hasta máximo 7 ya que el 8 es absoluto y no lo incluye
        for (int i = 0; i < numPiratas.length; i++) { //Hacemos un for que tendrá de tamaño el número que se haya generado en el random del pirata pirata
            if (i != numPiratas.length-1) { //Mientras el valor de i, no sea igual al valor a la ultimo indice del array de piratas, que genere piratas normales
                numPiratas[i] = new Pirata(NOMPIRATES[i], rnd.nextInt(1,4), respuestasHeroi, insultoPirata);
            } else { //Una vez llegue al último pirata, es decir, que el valor de i == al ultimo indice del array que haga lo siguiente
                numPiratas[i] = new LeChuck(rnd.nextInt(1,4), respuestasHeroi, insultoPirata); //En la ultima posición del array estará el pirata LeChuck
                }
        }
    }
    // Getters and Setters
    public Pirata[] getNumPiratas() {
        return numPiratas; ////Este getNumPiratas es importante a la hora de hacer el juego en el main para recoger el numero de piratas creados
    }

    public String getNomIsla() { //Este getNomisla será util a la hora de hacer el juego en el main para recoger el nombre de la isla que haya asignado el usuario
        return nomIsla;
    }
    
    //Metodos
    public Pirata vullUnPirata(int index){ //Generamos el metodo vullUnPirata al que le pasaremos un parametro el cual será int y que especificará en el main
        return numPiratas[index]; //Devolverá el pirata que se especifique en el index, es decir si en el index pone 1, devolverá el pirata numero 1; el cual ese pirata tiene sus 3 insultos
    }
}