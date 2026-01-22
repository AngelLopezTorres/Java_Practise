//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;
import java.util.Random;

public class GuybrushThreepwood extends Heroi {

    public GuybrushThreepwood(String[] respHeroi) { //Lo único que dejaremos por parametros serán las respuestas que se recogerán desde el main
        super("Guybrush Threepwood",10,respHeroi); // Le asignamos, las vidas y el nombre del heroe directamente desde el desde el super().
    }

    // MÉTODOS
    @Override
    public void defensar() { //Sobreescribiremos el método defensar para nuestro heroe Guybrush ya que este heroe no debe mostrar todas las preguntas como en el caso de la heroína Elaine y debe de disponer únicamente de la mitad de ellas y las respuestas que tendrá serán aleatorias (pero no se repetirán entre ellas) 
    Random rnd = new Random();
        boolean[] respRep = new boolean[respHeroi.length]; //declaramos un método booleano para que cada vez que llamemos al método defensar, si una vez que lo hemos llamado se han marcado como "true" los índices 1,6,8 (por ejemplo), cuando se vuelva a llamar, se reiniciará y esas preguntas pueden volver a aparecer
        int numRespHeroi = respHeroi.length / 2; // Dividimos por la mitad la total de preguntas de las que dispone el heroe, para obtener el número de respuestas que el heroe Guybrush mostrará.
        String[] respInd = new String[numRespHeroi]; // Creamos un nuevo array del tamaño del número de las respuestas que el heroe
        int i = 0;
        System.out.println("------------------------------Respuestas de " + nom + "-------------------------------------------------\n");
            while (i < numRespHeroi) {
            int rndResp = rnd.nextInt(respHeroi.length); //Generará un número random de todas que puede disponer el heroe, es decir de todas las preguntas ubicadas en el main ( del 1-12)
            if (!respRep[rndResp]) { // El array booleano mirará si el número que ha salido del insRnd no ha salido y entrará en el if, y si no simplemente volverá a empezar
                System.out.println((i+1) + ". " + respHeroi[rndResp]); // Mostrará las respuestas del heroe de forma enúmerada y sin repetirse.
                respInd[i] = respHeroi[rndResp]; // el array que creamos para guardar cada respuesta que salga irá almacenando cada respuesta que salga, en cada posición (0,1,2,3)
                respRep[rndResp] = true; //Marcaremos el array booleano como true, para que no se vuelvan a repetir
                i++; 
            }
            }
        System.out.print("\nElige tu respuesta " + nom + ": ");
        int respuesta = sc.nextInt(); // El usuario entrará un número
        
        while (respuesta <= 0 || respuesta > numRespHeroi) { //Mientras lo que haya respondido sea mayor al número de preguntas que se mostrarán y sea menor a 0 0 este while no se realizará
            System.out.print("\nEs un número no válido " + nom + " vuelve a elegir: "); //Te dice que vuelvas a introducir un número
            respuesta = sc.nextInt(); //Hace al usuario volver a introducir un número
        }
        respuestaHeroi = respInd[respuesta-1]; //Asignaremos a la variable respuestaHeroi que contendrá la respuesta del heroe; ya que al ser un método void, no podemos devolver nada, y deberemos asignar una variable desde fuera para que recoja la respuesta la cual, le restaremos -1 para que coincida con el indice del array
    }

    @Override
    public void sayHello() { //Sobreescribimos metodo que tenemos definido en el padre y lo personalizamos para que salga un mensaje de Guybrush 
        System.out.println("\n----------------------------------" + nom + " saluda---------------------------------------------------");
        System.out.println("\nSoy " + nom + " no siempre hago las cosas bien, pero pongo todo mi corazón. Bueno... casi siempre.\n");

    }

    @Override
    public void sayGoodBye() { // Sobreescribimos también la despedida
        System.out.println("\n-------------------------------Derrota de " + nom + "------------------------------------------------\n");
        System.out.println("No he sido capaz de derrotarlo, este capitulo de mi vida no quiero que lo recuerden.\n");
    }

}
