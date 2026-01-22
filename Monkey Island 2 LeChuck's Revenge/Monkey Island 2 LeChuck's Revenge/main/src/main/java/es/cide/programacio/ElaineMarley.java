//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;

public class ElaineMarley extends Heroi {
    
    public ElaineMarley(String[] respuestasHeroi) {//Lo único que dejaremos por parametros serán las respuestas que se recogerán desde el main
        super("Elaine Marley",10,respuestasHeroi); //Le asignamos directamente el nombre y la vida en el super(), y al estar declarados ya, podemos dejar unicamente en el constructor las preguntas del heroe
    }

    // MÉTODOS
    @Override
    public void sayHello() { //Sobreescribimos el método que hay en la clase padre Heroi, y lo personalizamos para el saludo que tendrá Elaine, cuándo elijamos jugar con ella
        System.out.println("\n----------------------------------" + nom + " saluda---------------------------------------------------");
        System.out.println("\nSoy " + nom + " mientras yo permanezca en pie, esta isla no caerá en la oscuridad. Caminad sin miedo: estáis bajo mi protección.\n");
    }

    @Override
    public void sayGoodBye() { //Sobreescribimos el método que hay en la clase padre Heroi, y lo personalizamos para la despedida que tendrá Elaine, en el caso de que pierda
        System.out.println("\n-------------------------------Derrota de " + nom + "------------------------------------------------\n");
        System.out.println("No he logrado derrotarlos, he fallado como gobernadora...\n");
    }

    //El método defensar() lo heredará del padre Heroi
}
