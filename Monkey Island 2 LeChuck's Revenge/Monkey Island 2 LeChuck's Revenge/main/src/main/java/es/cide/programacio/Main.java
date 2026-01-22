//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 9/11/2025
package es.cide.programacio;

import java.util.Scanner;

public class Main {
    private static final String[] INSULTOS = {
            "¡Luchas como un granjero!", // 1 (0)
            "Mi pañuelo limpiaría mejor el suelo que tú la cubierta.", // 2(1)
            "¡He hablado con simios más educados que tú!", // 3(2)
            "¡Eres el peor pirata que haya visto!", // 4(3)
            "¡Mi espada es más famosa que tú!", // 5(4)
            "¡Nadie me ha sacado sangre jamás, y menos un don nadie como tú!", // 6 (5)
            "¡Tienes los modales de un mendigo!", // 7(6)
            "¡Tu madre se vistió con un mono!", // 8(7)
            "¡Eres tan feo que harías vomitar a un cerdo!", // 9 (8)
            "¡He oído que eres un cobarde despreciable!", // 10 (9)
            "Serás recordado como el bufón de la isla." // 11 (10)
    };
    
    private static final String[] RESPUESTAS = {
            "Qué apropiado, tú peleas como una vaca.", 
            "Así es, si lo usas para limpiarte la lengua.",
            "Me alegra que hallaras a alguien que entendiera tus problemas.",
            "Al menos lo has visto.",
            "Sí, pero tú la necesitas para sentirte importante.",
            "¿Tan rápido corres antes de que empiece el combate?",
            "Quería estar a la altura de tu compañía.",
            "Me alegra que la recuerdes de tus visitas al zoológico.",
            "Entonces será por eso que siempre te veo solo.",
            "Qué curioso, yo oí lo mismo de ti, pero de una fuente más fiable.",
            "Más triste es ser derrotado por el, y que todos lo recuerden",
            "Me sobra espada, lo que me falta es rival."
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Heroi heroi;
        System.out.println("\n------------HEROES--------------------------\n1. Gyubrush ThreepWood\n2. Elaine Marley\n--------------------------------------------");
        Illa illa = new Illa(INSULTOS, RESPUESTAS);
        System.out.print("Elige a tu heroe: ");
        int personaje = sc.nextInt(); //Elige al personaje
        
        while (personaje > 2) { //Para en caso de que elija un número mayor al de los heroes que vuelva a elegir
            System.out.print("Heroe no valido, vuelve a elegir a tu heroe: ");
            personaje = sc.nextInt();//Si el número que elije es 3 por ejemplo sin el while eligiría siempre a Elaine pero el usuario no puede poner cualquier número y que sea Elaine, tiene que ser entre el 1 y el 2
        }
        
        if (personaje == 1) { //Si lo que elige es el 1 se creará a Guybrush
            heroi = new GuybrushThreepwood(RESPUESTAS);
        } else { //Si el que otro número que elija, que está obligado a que sea el 2, y no puede introducir ni el 3/4/5 será Elaine
            heroi = new ElaineMarley(RESPUESTAS);
        }
        
        heroi.sayHello();
        while (i < illa.getNumPiratas().length && heroi.getVida() > 0) { //Mientras i sea menor al número de piratas y el/la heroe/heroina, siga viv@, hara lo siguiente
            System.out.println("---------------------------------------- PIRATA ENCONTRADO:" + illa.vullUnPirata(i).getNom()+ " ----------------------------------------------------\n");
            illa.vullUnPirata(i).sayHello(); //El pirata saluda
            System.out.println("\n-------------------------------------------------------------------------------------------------------------");
            while (illa.vullUnPirata(i).getVida() > 0 && heroi.getVida() > 0) { //Ebtra en combate entre el pirata y el heroe/heroina                
                System.out.println("\n\n|||||||||||||||||||||||||||||||||||||||||| " + illa.getNomIsla() + " ||||||||||||||||||||||||||||||||||||||||||||||||||||");
                illa.vullUnPirata(i).insultar(); // Muestra insultos
                heroi.defensar(); //Se muestran los insultos del heroe/heroina
                if (illa.vullUnPirata(i).replica(heroi.getRespuestaHeroi())) { // Entrará en este if si la respuesta que da es correcta
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nVida restante de " + heroi.getNom() + ": " + heroi.getVida());
                        if (heroi instanceof GuybrushThreepwood ) { //Si el heroe que hemos instanciado es Guybrush Threepwood entonces le restará 2 vidas al pirata
                            illa.vullUnPirata(i).vida();
                            illa.vullUnPirata(i).vida();  
                        } else {
                            illa.vullUnPirata(i).vida();  //Restará la vida del pirata
                        }
                } else { // En caso de que sea false
                    heroi.vida(); // Le restará vida al heroe;
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nVida restante de " + heroi.getNom() + ": " + heroi.getVida());
                    System.out.println("\n-------------------------------------------------------------------------------------------------------------");
                }
            }
            if (illa.vullUnPirata(i).vida <= 0) { //Si el pirata muere
                illa.vullUnPirata(i).sayGoodBye(); //Mostra el mensaje de despedida
            } else { // Si no muestra el del heroe
                heroi.sayGoodBye();
                }
            i++;
        }
                
        if (heroi.getVida() > 0) { // Si cuando sale del bucle la vida del heroe es mayor a 0 entonces, es decir, ha ganado
            System.out.println("\n---------------------------------------FINAL DE PARTIDA-------------------------------------------\n");
            System.out.println(heroi.getNom() + ". Ha derrotado a todos los piratas, y ahora la paz reina al haber logrado defender Monkey Island " + illa.getNomIsla() +"\n");
            } else { //Si ha perdido
            System.out.println("-------------------------------------------FINAL DE PARTIDA-------------------------------------------------\n");
            System.out.println(heroi.getNom() + " no ha podido derrotar a todos los piratas y no ha podido defender Monkey Island \n");                
        }   
        sc.close();
    }
}
