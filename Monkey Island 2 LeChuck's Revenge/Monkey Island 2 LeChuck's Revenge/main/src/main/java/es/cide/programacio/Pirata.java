//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;

import java.util.Random;

public class Pirata extends Personatge implements Speak, Fight {

    //ATRIBUTOS
    protected int numPreg;
    protected String[] insultoPirata;
    protected boolean[] insRepetido;
    protected String[] respIndice;
    protected String[] respuestas;
    protected String[] insultos;
    protected Random rnd = new Random();
    //CONSTRUCTOR
    public Pirata(String nom, int vida, String[] respuestas, String[] insultos) {
        super(nom, vida); //Llama al constructor del padre
        this.respuestas = respuestas;
        this.insultos = insultos;
        insultoPirata = new String[3]; // Declaramos el array de insultos que tendrán los piratas por defecto
        respIndice = new String[3]; //Declaramos el array que contendrá cada respuesta correspondiente que se genere con el pirata para poder usarlo en el metodo replica() que tendrán los piratas por defecto
        insRepetido = new boolean[insultos.length]; //Creamos el booleano del tamaño de los insultos para que no se repitan
        int i = 0; //Declaramos esta variable dentro del constructor porque es algo que solo usaremos aquí y fuera del constructor no tiene uso
        while (i < insultoPirata.length) { //Mientras la i sea menor al tamaño del array que son las preguntas que tendrá el pirata
            int insRnd = rnd.nextInt(insultos.length); //Delcaramos los insultos random aquí dentro también porque para llamar después a cada pirata que tenga el pirata no usaremos insRnd y solo lo usaremos para asignarle el insulto de los 10 que tenemos y lo ponemos en dentro del while para que genere un insulto cada vez
            if (!insRepetido[insRnd]) { // El array booleano mirará si el número que ha salido del insRnd no ha salido y entrará en el if
                insultoPirata[i] = insultos[insRnd]; //Los 3 insultos pirata (0,1,2) se rellenaran cada uno con un insulto del String del insultos y el insulto será el num que se haya generado del insRnd
                insRepetido[insRnd] = true; //Entonces se marcará como true el insulto
                respIndice[i] = respuestas[insRnd]; //Asignara al array de respIndice 0,1,2 la respectiva respuesta de cada insulto
                i++;
            }
        }
    }

    //GETTERS Y SETTERS
    public String[] getRespIndice() {
        return respIndice;
    }

    public void setRespIndice(String[] respIndice) {
        this.respIndice = respIndice;
    }

    public String[] getInsultoPirata() {
        return insultoPirata;
    }

    public void setInsultoPirata(String[] insultoPirata) {
        this.insultoPirata = insultoPirata;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean[] getInsRepetido() {
        return insRepetido;
    }

    public void setInsRepetido(boolean[] insRepetido) {
        this.insRepetido = insRepetido;
    }

    public boolean replica(String respuestaUsuario) { //Método que comparará las respuestas y dirá si es correcto o no, y devolverá un true/false y que no hará falta hacer override en LeChuck ya que utilizará directamente el de la clase padre
        return respuestaUsuario.equals(respIndice[numPreg]);
    }


    //METODOS
    @Override //Al estar definido en una interfaz, estoy obligado a implementarlo, pero en el caso del pirata este metodo "defensar", no le es útil al pirata, por lo cual haremos lo que nos pide que es declararlo en nuestro código, pero no lo desarrollaremos ni implementaremos a nuestro juego
    public void defensar() {
        System.out.println("Metodo defender que no usará el pirata");
    }

    

    @Override
    public boolean vida() { // Sobreescribimos el método abstracto declarado en personaje, y este método lo usará tanto LeChuck como los piratas normales 
        vida--; // Le restamos la vida
        return vida > 0 ; // Y devuelve el valor de seguir que puede ser true or false. Es decir si está vivo o no
    }

    @Override
    public void insultar() { //Al estar definido en una interfaz, lo declararemos en nuestro código, y todos los piratas por defecto que se creen, utilizarán este método
        numPreg = rnd.nextInt(insultoPirata.length);
        if (vida == 1) {
            System.out.println("\n------------------------------------El pirata " + nom + " insulta: -------------------------------------------------\n");
            System.out.println(insultoPirata[numPreg] + " ¡Para avanzar tendrás que ganarme " + vida + " batalla!\n");
        } else {
            System.out.println("\n------------------------------------El pirata " + nom + " insulta: -------------------------------------------------\n");
            System.out.println(insultoPirata[numPreg] + " ¡Para avanzar tendrás que ganarme " + vida + " batallas!\n");
        }
    }

    @Override
    public void sayHello() { //Mensaje de saludo por defecto, que usarán todos los piratas que no sean LeChuck
        System.out.println("Soy el pirata " + nom + ". Te habrías ahorrado problemas quedándote en tierra... ¡Porque vas a enfrentarte a mí!");
    }
    @Override
    public void sayGoodBye() { //Mensaje de despedida por defecto que aparecerá cuando el pirata sea derrotado, que usarán todos los piratas que no sean LeChuck
        System.out.println("\n-------------------------------Derrota de " + nom + "---------------------------------------------\n");
        System.out.println("Me has logrado derrotar, no esperaba que fueses tan fuerte\n");
    }

}
