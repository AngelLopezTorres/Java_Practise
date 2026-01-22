//Ángel Cristian López Torres
//Fecha: 14/10/2025
//DNI: 41713034G
package es.cide.es;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();    
    int puntos = 1;
    int i = 0;
    int numInsult = 1;
    char respuesta = ' ';
    int respuesta2 = 0; // Es el valor que elegimos para que en caso de ser la respuesta que de el usuario en las respuestas no sea  'n', se cambie a Int
    boolean n = true; //Con este mantendremos que la n todavía no ha sido seleccionada, en el momento que sea seleccionada la cambiaremos a false
    int puntosMaximos = 0;

        String[] arrayInsultos = { //String que contiene los insultos
            "Mi lengua es más hábil que cualquier espada","¡Persiguiendo a mi presa, la dejo en un aprieto!","¡En guardia! ¡Mamarracho!",
            "¡He hablado con simios más educados que tú!","¡No pienso aguantar tu insolencia aquí sentado!","¡Una vez tuve un perro más listo que tú!",
            "Mi espada es famosa en todo el Caribe", "¡Mi nombre es temido en cada sucio rincón de esta isla!", "¡Tus habilidades son tan útiles como un ancla de plumas!"
            ,"¡Tu estilo de lucha haría dormir hasta a los muertos!", "¡Mi lengua podría destriparte sin necesidad de espada!", "¡Persigo a mis enemigos hasta que imploran clemencia!",
            "¡En guardia! ¡Espero que hayas hecho testamento!","¡He conocido a ratas con modales más finos que los tuyos!","¡No pienso quedarme de brazos cruzados ante tu estupidez!",
            "¡Una vez tuve un loro que debatía mejor que tú!","Mi espada reluce con las lágrimas de mis oponentes", "¡Mi nombre causa escalofríos incluso a los fantasmas del Caribe!"
        };
    
        boolean[] insultos = new boolean[arrayInsultos.length]; // Establecemos un tipo boleano para definir cuales se han repetido y cuales no
        int randomIns = random.nextInt(arrayInsultos.length); // Hacemos que nos genere insultos random cogiendo el contenido que hay dentro de array insultos
        
        String[] correctas = { //Un string que contiene las respuestas correctas
            "Primero deberías dejar de usarla como un plumero.", "Entonces sé un buen perro ¡Siéntate! ¡Quieto!","¡Tus palabras no son de un macho!", 
            "Me alegra que asistieras a tu reunión familiar diaria.", "Espero que tengas un barco para una rápida huida.","Te habrá enseñado todo lo que sabes.",
            "Eso es lo que hubiese querido tu yo de pequeño", "Qué pena me da que nadie haya oído hablar de ti","¡Pues al menos tengo estilo!", 
            "Entonces porque todo el mundo está bailando", "Entonces mejor guarda tu lengua antes de cortarte la lengua a ti mismo.","Prepárate, porque no pienso detenerme hasta atraparte.",
            "Espero que hayas escrito tu testamento con rapidez.", "Vaya, supongo que las ratas te darían lecciones de cortesía.","No te preocupes, tu insolencia no durará mucho.", 
            "Ojalá tu loro te enseñara algo de sentido común.", "Reluce más porque refleja tu derrota inevitable.", "Si los fantasmas tiemblan, tú deberías salir corriendo."
        };

        String[] incorrecta1 = { //Un string que contiene la primera respuesta incorrecta
            "¿Has probado con tenedores?", "¿Eso incluye animales de granja?", "Yo traje lápices, no espadas.",
            "Yo también estudié en la jungla.", "¡Entonces ponte de pie y baila!", "¡¿Y qué raza era?!",
            "¿La compraste en oferta?", "¿Y también en los limpios?","¿Quieres que te enseñe a hablar correctamente?", 
            "¿Eso significa que eres rápido?", "¿Y a quién le importa tu espada?", "¿Y tienen tienen diplomas?", 
            "¿Debería sentarme también?", "¿Tienes un loro de juguete?", "¿Brilla porque está sucia?", 
            "¿Los fantasmas son amigables?", "¿Quieres convertir tu lengua en espada?", "¿Y yo qué tengo que ver con eso?", 
            "¿Tu espada es de madera?",  "¿Las ratas también son vegetarianas?", "¿Debería aplaudir tu insolencia?", "¿El loro habla español?", 
            "¿Está afilada o es decorativa?", "¿Y si me encuentro con un pirata real?"
        };

        int incorrecta1Aleat = random.nextInt(incorrecta1.length); //Aleatorio para las preguntas incorrectas 

        String[] incorrecta2 = { //Un string que contiene segunda respuesta incorrecta
            "¿Ya hablaste con la pared?", "¿Eso lo aprendiste en la escuela de peces?", "Traje flores, no piedras.",
            "También me perdí en el bosque.", "¡Entonces corre y canta!", "¿Y cuál era el nombre del dragón?",
            "¿Lo conseguiste en descuento?", "¿Y también en las bibliotecas?"
        };
        System.out.println("---------------------------------INTRODUCCIÓN----------------------------------------------------");
        System.out.println("Buenas bienvenido a mi videojuego, este juego trata de acertar un número de insultos.\nDependiendo de lo bien que te desenvuelvas con ellos tu puntuación aumentará o disminuirá.\nSi tu puntuación llega a 0, perderás la partida, y puedes salir en cualquier momento pulsando 'n'. \nRecuerda que comienzas la partida con 1 punto así que la primera ronda también puede ser la última.\n\nBuena suerte.");
        System.out.println("------------------------------------------------------------------------------------------------");

        int incorrecta2Aleat = random.nextInt(incorrecta2.length); //Aleatorio para las preguntas incorrectas 
        System.out.print("Introduce el número de rondas (1-10): ");
        int numRondas = sc.nextInt();
        System.out.println();


        while (numRondas < 1 || numRondas > 10) { // En caso de que el usuario introduzca un numero que sea menor a 1 y superior a 10 que se vuelva a introducir un número hasta que esté dentro del rango
            System.out.println("Número inválido, introduce uno entre 1 y 10:");
            numRondas = sc.nextInt(); // Introce el valor de las rondas a jugar
        }

        
       while(i < numRondas && puntos > 0 && n){ //Mientras la i, sea menor al numero de rondas que el usuario ha elegido y los puntos de la partida, no lleguen a cero, y la variable booleana n que será si queremos salir, se mantenga en true que realice el juego
        numInsult = 0; // Cada vez que termine ronda/iteración el numero de insultos se restablezca a 0 
        while(numInsult < 1){ 
            randomIns = random.nextInt(arrayInsultos.length); // Genera un nuevo insulto de forma aleatoria
            if(!insultos[randomIns]){ // En este if se dice "Si el insulto booleano (que contiene las preguntas dentro), no se ha mostrado, que se imprima por terminal"
            System.out.println("----------------Ronda número "+(i+1)+"-------------------------\n"); //Le sumamos uno para que no aparezca del 0-9 o del 0 al número que introduzca -1, ya que lo normal es que si es la primera ronda aparezca 1 y no 0
            System.out.println("----------------INSULTO PIRATA-------------------------");
            System.out.println("");
            System.out.println("  " +arrayInsultos[randomIns]+"\n"); //Muestra el insulto random
            insultos[randomIns] = true; //Cuando lo muestra cambia su valor a true para que no se vuelva a mostrar
            numInsult++; //Aumenta el numero de valor del numero de insulto a 1 para que salga del bucle
            }
        }
        int respCorrecta = random.nextInt(0,3); //Genera un numero aleatorio donde irá la respuesta correcta
        if(respCorrecta == 0) { //En caso de que el numero generado sea el 0 
            System.out.println("----------------RESPUESTAS-----------------------------\n");
            System.out.println("1. "+ correctas[randomIns]);
            System.out.println("2. "+ incorrecta1[incorrecta1Aleat]);
            System.out.println("3. "+ incorrecta2[incorrecta2Aleat]);
        }else if(respCorrecta == 1) { //En caso de que el numero generado sea el 2
            System.out.println("----------------RESPUESTAS-----------------------------\n");
            System.out.println("1. "+incorrecta1[incorrecta1Aleat]);
            System.out.println("2. "+correctas[randomIns]);
            System.out.println("3. "+incorrecta2[incorrecta2Aleat]);
        }else if(respCorrecta == 2) { //En caso de que el numero generado sea el 2
            System.out.println("----------------RESPUESTAS-----------------------------\n");
            System.out.println("1. "+incorrecta1[incorrecta1Aleat]);
            System.out.println("2. "+incorrecta2[incorrecta2Aleat]);
            System.out.println("3. "+correctas[randomIns]);
        }
        System.out.print("\n Elección: "); 

        respuesta = sc.next().charAt(0); // Una vez nos han entregado las preguntas, como vamos a tener que introducir solo 1,2,3 o n, le decimos que guarde de respuesta unicamente el primer caracter que se introduce
        
        if (respuesta == 'n' || respuesta == 'N') { //Si la respuesta que se introduce es 'n' o 'N'
            System.out.println("----------------Mensaje de retirada-----------------------------\n");
            System.out.println("Como se esperaba, retirándote sin pelear...\n"); // Muestra un mensaje de despedida
            n = false; // Y cambia ese valor que teníamos como condición del while a false, para que se pare de ejecutar el código
            } else if (respuesta == '1' || respuesta == '2' || respuesta == '3') { // En caso de que la respuesta sea 1, 2 o 3
                if (respuesta == '1'){ // En caso de que sea 1, respuesta2 será 1
                    respuesta2 = 1;
                } else if (respuesta == '2'){ // En caso de que sea 2, respuesta2 será 2
                   respuesta2 = 2; 
                } else if (respuesta == '3'){
                   respuesta2 = 3; // En caso de que sea 2, respuesta2 será 3
                }
                
                if (respuesta2-1 == respCorrecta) { // Una vez convertidos si respuesta2 -1 (Le restamos 1, para que coincida con la respuesta correcta, ya que el usuario debe de elegir entre 1 y 3 pero la "respuestacorrect" va del 0-3)
                    System.out.println("\n----------------ESTADO-------------------------------\n");
                    System.out.println("Has elegido como un pirata");
                    puntos = puntos +2; // Si la respuesta es correcta, suma un punto
                    System.out.println("Puntos actuales: " + puntos+"\n");
                } else {
                    System.out.println("----------------ESTADO-----------------------------\n");
                    System.out.println("Incorrecto");
                    puntos = puntos-1; // Si la respuesta es incorrecta, resta un punto
                    System.out.println("Puntos actuales: " + puntos +"\n"); //Va mostrando al usuario la cantidad de puntos que tiene
        } 
        } else if (respuesta >= '4' && respuesta <= '9') { // Si es mayor a 3 (hasta 9) que muestre un mensaje de eror y reste puntos.
            System.out.println("----------------ESTADO-----------------------------\n");
            System.out.println("Número mayor a 3, respuesta incorrecta");
            puntos--;
            System.out.println("Puntos actuales: " + puntos + "\n"); //Va mostrando al usuario la cantidad de puntos que tiene
        }
       i++; //Aumenta el valor del contador del while
    }   // Termina el bucle y da los mensajes en base a la partida realizada
    
    if (numRondas == 1 && respuesta != 'n'){ // Esto es en caso de que el usuario escoja los números más bajos, el 1 y el 2, tengan normas especiales, a partir del 3 ya pueden cumplirse las condiciones normales, 
        if (puntos <= 0) { // Una vez terminada la partida, en caso de solo haber recibido 0 puntos
            System.out.println("----------------RESULTADO FINAL-----------------------------\n");
            System.out.println("Como se esperaba, no eres suficientemente fuerte, tu muerte no será recordada");
        } else{
            System.out.println("----------------RESULTADO FINAL-----------------------------\n");
            System.out.println("Me has derrotado en todos los sentidos, eres el rey del nuevo mundo");
        } 
    } else if (numRondas == 2 && respuesta != 'n') {// no se incluye el numero 2 porque los rangos a la hora de introducir puntos > intermedioPuntos && puntos < puntosInter tiene que ser un numero mayor que 1 y menor que 2, entonces no cuadra igual que con las condiciones a partir del 3, es más sencillo definir el número 2 de esta manera
         if (puntos <= 0) { // Una vez terminada la partida, en caso de solo haber recibido 0 puntos
            System.out.println("----------------RESULTADO FINAL-----------------------------\n");
            System.out.println("Como se esperaba, no eres suficientemente fuerte, tu muerte no será recordada");
        }  else if (puntos == 1){ //En caso de que el resultado sea 1
            System.out.println("----------------RESULTADO FINAL-----------------------------\n");
            System.out.println("¡Hasta los loros se ríen de ti!");
        } else if (puntos == 3){ //En caso de que el resultado sea 3
            System.out.println("----------------RESULTADO FINAL-----------------------------\n");
            System.out.println("Eres el rey de los piratas");
        } else if (puntos == 5){ // En caso de que el resultado sea 5
            System.out.println("----------------RESULTADO FINAL-----------------------------\n");
            System.out.println("Me has derrotado en todos los sentidos, eres el rey del nuevo mundo");
        }

    } if(numRondas >= 3 && respuesta != 'n'){
        puntosMaximos = (numRondas * 2)+1; //Serán los puntos máximos que puede por partida, y se le añade 1 ya que nuestro contador no empieza desde 0, si no que empieza desde 1
        int intermedioPuntos = numRondas / 2; // Será lo que defina el punto intermedio para que dependiendo de los puntos que saque de una respuesta
        int puntosInter = numRondas; // Se comparará junto al numero máximo de puntos que se puede conseguir para poder decidir si es el rey de los piratas o no
            if (puntos <= 0) { // En caso de que sea 0, se muestra el mensaje de derrota del personaje
                System.out.println("----------------RESULTADO FINAL-----------------------------\n");
                System.out.println("Como se esperaba, no eres suficientemente fuerte, tu muerte no será recordada");
            } else if (puntos > 0 && puntos <= intermedioPuntos) { //Si los puntos son mayores  a 0 y menores a intermediopuntos (numrondas / 2) mostraría el mensaje equivalente a una puntuación baja
                System.out.println("----------------RESULTADO FINAL-----------------------------\n");
                System.out.println("¡Hasta los loros se ríen de ti!");
            } else if (puntos > intermedioPuntos && puntos < puntosInter) { //Si los puntos son mayores a intermediopunto y menores a puntosinter que es el numero de rondas, es decir por ejemplo si se eligen 4 rondas*
                System.out.println("----------------RESULTADO FINAL-----------------------------\n"); //*si los puntos que ha conseguido el jugador son mayores a la division de 4 / 2 y menor a 4 entonces se muestra un mensaje de puntuación media
                System.out.println("Te has defendido como un buen marinero");
            } else if (puntos >= puntosInter && puntos < puntosMaximos) { // En caso de que los puntos obtenidos sean mayores o iguales al numero de rondas, y menores al numero máximo entonces, mostrará un mensaje por alta puntuación
                System.out.println("----------------RESULTADO FINAL-----------------------------\n");
                System.out.println("Eres el rey de los piratas");
            } else if (puntos == puntosMaximos) { // Y en caso de haber realizado todas las respuestas correctas que sería el (numero de rondas * 2)+1 ya que recuerdo, empezamos por 1, se mostrará un mensaje de rondas perfectas
                System.out.println("----------------RESULTADO FINAL-----------------------------\n");
                System.out.println("Me has derrotado en todos los sentidos, eres el rey del nuevo mundo");
            }
    } 
        sc.close(); // Se cierra el Scanner
    }
}