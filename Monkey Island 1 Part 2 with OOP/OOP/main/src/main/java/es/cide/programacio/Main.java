//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 4/11/2025
package es.cide.programacio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido heroe, te vas a embarcar en una nueva aventura, para iniciar esta aventura necesito saber como te llamas heroe:");
        String nomHeroi = sc.nextLine();
        Heroi heroi = new Heroi(nomHeroi); //Creamos el objeto Heroi y lo declaramos y cuando queramos usar el objeto lo haremos con el nombre de la variable que será "heroi" y le pasamos el nomHeroi ya que este objeto tiene un parametro declarado en su constructor
        System.out.println("A que isla te diriges pequeño heroe:");
        String nomIlla = sc.nextLine();
        Illa illa = new Illa(nomIlla); // Realizamos lo mismo con el nombre de la isla para darle nombre a la isla

        for (int j = 0; j < illa.getNUMPIRATAS().length && heroi.getVida() > 0; j++) { //EL juego se ejecutará mientras la variable j sea menor al numero de piratas y la vida del heroe sea mayor a 0  en caso de que alguna de las dos no se cumpla saldrá (Es decir, ganar o morir)
            Pirata pirata = illa.vullUnPirata(j); //Llamamos al metodo de la isla vullUnPirata, y le introducimos el valor de j y eso lo que hará será llamar al pirata que tenga el valor de j (1,2,3...) y cada vez que llamemos a la variable pirata con el insulto lo que estaremos haciendo es realmente un pirata[index].insultar
                System.out.println("-------------------------------------------Te has encontrado con un pirata--------------------------------------------------");
            while (pirata.getVida() > 0 && heroi.getVida() > 0) {  //Con ese pirata que hemos llamado realizaremos la pelea mientras la vida de ese pirata sea mayor a 0 y la vida del heroe sea mayor a 0, en caso de que uno de los dos no se cumpla sale de ese bucle y vuelve a llamar a otro pirata
                System.out.println("----------------------------------------------------------Isla " + illa.getNom() + "------------------------------------------------------------");
                pirata.insultar(); //Utilizaremos el metodo insultar con el pirata que tengamos en ese momento
                if (pirata.replica(heroi.defensar())) { //Si el metodo pirata.replica() de la respuesta que de el heroe es true entonces hará lo que haya en ese if
                    System.out.println("Vida del heroe " + heroi.getNom() + ": " + heroi.getVida());
                    pirata.vida();
                } else { //En caso de que sea false
                    heroi.vida(); //Le restará vida al heroe;
                }
            }
        }
        if (heroi.getVida() > 0) { // Si cuando sale del bucle la vida del heroe es mayor a 0 entonces, es decir, ha ganado
            System.out.println("---------------------------------FINAL DE PARTIDA-------------------------------------------------\n");
            System.out.println("Felicidades " + heroi.getNom() + ". Has derrotado a todos los piratas, eres eres el mejor pirata de toda Isla " + illa.getNom() +"\n");
        } else { //Si ha perdido
            System.out.println("---------------------------------FINAL DE PARTIDA-------------------------------------------------\n");
            System.out.println("Has perdido, no te has convertido en el mejor pirata, realmente no serás recordado\n");
        }
        sc.close();
    }
}
