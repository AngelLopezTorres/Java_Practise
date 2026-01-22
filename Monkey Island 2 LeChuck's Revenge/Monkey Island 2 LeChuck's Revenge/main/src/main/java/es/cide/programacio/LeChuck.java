//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;

public class LeChuck extends Pirata {
    
    public LeChuck(int vida, String[] respuestas, String[] insultos) { //Quitamos el nombre de los parámetros de LeChuck porque ya le hemos asignado un nombre
        super("Le Chuck", vida*2, respuestas, insultos); // Le asignamos, el nombre y la vida multiplicandolo por 2 para que tenga el doble, desde el super()
        insultoPirata = new String[4]; //Sobreescribimos le valor de la array de los insultos piratas, para añadir también la pregunta nueva dentro del array
        respIndice = new String[4]; //Sobreescribimos le valor del array del array que guardará cuales son las respuestas a esos insultos
        int i = 0; 
        while (i < insultoPirata.length) { //Replicamos el while que tenemos en Pirata, para que vuelva a rellenar los insultos, pero esta vez el tamaño del array es de 3 y no 4 y los tenemos todos en un mismo array y no en dos diferentes
            int insRnd = rnd.nextInt(insultos.length);
            if (!insRepetido[insRnd]) {  //El array booleano usaremos el del padre también ya que ese no varía en nada y no es necesario sobreescribirlo
                insultoPirata[i] = insultos[insRnd]; //Rellenamos los insultos de LeChuck              
                respIndice[i] = respuestas[insRnd]; //Guardamos las respuestas de esos insultos en respIndice
                insRepetido[insRnd] = true; //Lo marcamos como true para que no se repita
                i++;
            }
        }
        insultoPirata[3] = "¿Tu espada viene con tutorial incluido o siempre apuntas al aire?"; //Y en la ultima posición del array que hemos sobreescrito, le ponemos la pregunta nueva que solo tendrá LeChuck
        respIndice[3] = "Me sobra espada, lo que me falta es rival."; //En indice de respuestas también añadiremos la respuesta a esa pregunta, en la última posición
    }



    //Métodos
    @Override
    public void sayHello() { //Sobreescribimos el método para que nos muestre un mensaje personalizado en caso de que se derrotase a Lechuck
        System.out.println("Conquistaré toda la isla y no dejaré que alguien con la fuerza de un calamar me derrote");
    }

    @Override
    public void sayGoodBye() { //Sobreescribimos el método para que nos muestre un mensaje personalizado en caso de que se derrotase a Lechuck
        System.out.println("\n-------------------------------Derrota de " + nom + "---------------------------------------------\n");
        System.out.println("Cómo alguien como tú puede ser capaz de superarme, ojalá el mar te trague y no encuentres el sol, ¡Malnacido!");
    }

    @Override
    public void insultar() { //Podríamos usar el método del padre, ya que el numPreg coge las preguntas dependiendo del tamaño del array que tengan lo insultos piratas por lo cual sería del 0-3 (4) y haría su función, pero le he hecho Override para que se diferencie y que las salidas por consola sean diferentes al ser LeChuck.
        numPreg = rnd.nextInt(insultoPirata.length);
        if (vida == 1) {
            System.out.println("\n------------------------------------El gran pirata " + nom + " insulta: ----------------------------------------------\n");
            System.out.println(insultoPirata[numPreg] + " ¡Solo podrás evitar que conquiste Monkey Island si me derrotas " + vida + " vez!\n");
        } else {
            System.out.println("\n------------------------------------El gran pirata " + nom + " insulta: ----------------------------------------------\n");
            System.out.println(insultoPirata[numPreg] + " ¡Solo podrás evitar que conquiste Monkey Island si me derrotas " + vida + " veces!\n");
        }
    }
    //El método réplica lo hereda del padre Pirata
    }

