//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 4/11/2025
package es.cide.programacio;
import java.util.Random;

public class Illa {
//Atributos
    private final Pirata[] NUMPIRATAS;
    private final String NOM;

    public Illa(String nomIsla) { //Constructor de Illa con un parametro String nomIsla que se deberá de declarar a la hora de crear el objeto Illa
        Random rnd = new Random();
        this.NOM = nomIsla; // referenciamos al atributo nom con nomIsla 
        this.NUMPIRATAS = new Pirata[rnd.nextInt(3,8)]; //Genera un numero de piratas que empieza en el 3 y será hasta máximo 7 ya que el 8 es absoluto y no lo incluye
        for (int i = 0; i < NUMPIRATAS.length; i++) { //Hacemos un for que tendrá de tamaño el número que se haya generado en el random del pirata pirata
            this.NUMPIRATAS[i] = new Pirata(); //Va rellenando el array de numPiratas con nuevos piratas
        }
    }
    // Getters and Setters
    public Pirata[] getNUMPIRATAS() {
        return NUMPIRATAS; ////Este getNumPiratas es importante a la hora de hacer el juego en el main para recoger el numero de piratas creados
    }

    public String getNom() { //Este getNomisla será util a la hora de hacer el juego en el main para recoger el nombre de la isla que haya asignado el usuario
        return NOM;
    }
    
    //Metodos
    public Pirata vullUnPirata(int index){ //Generamos el metodo vullUnPirata al que le pasaremos un parametro el cual será int y que especificará en el main
        return NUMPIRATAS[index]; //Devolverá el pirata que se especifique en el index, es decir si en el index pone 1, devolverá el pirata numero 1; el cual ese pirata tiene sus 3 insultos
    }
}
