//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;

import java.util.Scanner;

public abstract class Heroi extends Personatge implements Fight, Speak {
    //Atributos
    protected String respuestaHeroi; //Almacena la respuesta para luego en el main utilizarla con el getter
    protected String[] respHeroi;
    protected Scanner sc = new Scanner(System.in);

    public Heroi(String nom, int vida, String[] respHeroi) {
        super(nom, vida); //Llama al constructor del padre
        this.respHeroi = respHeroi;
    }

    //GETTERS Y SETTERS
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

    public String getRespuestaHeroi() {
        return respuestaHeroi;
    }

    public void setRespuestaHeroi(String respuestaHeroi) {
        this.respuestaHeroi = respuestaHeroi;
    }

    @Override
    public void insultar() { //Al estar definido en una interfaz, estoy obligado a implementarlo, pero en el caso del pirata este metodo "insultar", no es un método que el heroe utiliza, por lo cual haremos lo que nos pide que es declararlo en nuestro código, pero no lo desarrollaremos ni implementaremos a nuestro juego
        System.out.println("Metodo insultar que no usará el heroe");
    }
    
    @Override
    public void defensar() { // Metodo defensar() que mostrará todos los insultos y que si no se hace Override, Elaine utilizará este método
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < respHeroi.length; i++ ) { // Muestra todas las respuestas
            System.out.println((i+1) + ". " + respHeroi[i]);
        }

        System.out.print("\nElige tu respuesta " + nom + ": ");
        int respuesta = sc.nextInt(); // El usuario entrará un número
        
        while (respuesta <= 0 || respuesta > respHeroi.length) { //Mientras lo que haya respondido sea mayor al array y a 0 este while no se realizará
            System.out.print("\nEs un número no válido " + nom + " vuelve a elegir: "); //Te dice que vuelvas a introducir un número
            respuesta = sc.nextInt(); //Hace al usuario volver a introducir un número
        }
        respuestaHeroi = respHeroi[respuesta - 1]; //Cómo el método es void y no podemos devolver, ni un String, int...., Lo que haremos es asignarle a una variable externa la respuesta que haya elegido el usuario y utilizar el getter de esa variable
    }

    @Override
    public boolean vida() { //método booleano que resta vida y que si no se hace Override, será el método común que tendrán todas las clases que sean declaradas como hija/o de Heroi
        this.vida--; // Resta la vida
        return vida > 0; // Devolverá si es true or false
    }

    @Override
    public void sayHello() { //Declamos un mensaje por defecto que nos sirve para saber si estamos haciendo bien el @Override en Elaine o Guybursh
        System.out.println("Soy " + nom + " Yo derrotaré a todos los piratas");
    }

    @Override
    public void sayGoodBye() { //Declamos un mensaje por defecto que nos sirve para saber si estamos haciendo bien el @Override en Elaine o Guybursh
        System.out.println("Lo siento, no pude derrotarlos a todos");
    }
    }
