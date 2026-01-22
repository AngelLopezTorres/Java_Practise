//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;

public abstract class Personatge { //Clase abstracta

    protected String nom;
    protected int vida;

    public Personatge(String nom, int vida) { //Constructor que heredarán los hijos
        this.nom = nom;
        this.vida = vida;
    }
    public abstract boolean vida(); //Método que los hijos estarán obligados a implementar
}