//Nom: Ángel Cristian López Torres
//Data: 25/09/2006
//DNI: 41713034G

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        
        // INDICA LOS IDENTIFICADORES CORRECTOS

       int registro1;
        // int 1registro; // No es correcto porque comienza con un dígito
       int archivo_3;
        // int while;// no es correcto porque es una palabra reservada
       int $impuesto;
        // int año; // año no es correcto porque tiene una carácter especial
        // int Primer apellido; // Primer apellido no es correcto porque tiene un espacio
       int rimer_apellido;
        // int primer-apellido; // no es correcto porque tiene un guion
        int primerApellido;
        // int Tom's; // no es correcto porque tiene un apóstrofe
        int C3PO;
        // int 123#;
        // int PesoMáximo; // no es correcto porque tiene una tilde
         // int%descuento; //  no es correcto porque tiene  un carácter especial
        int Weight; 
        // int $$precioMínimo; // no es correcto porque tiene una tilde y un carácter especial
        // int $Único; // no es correcto porque tiene una tilde y un carácter especial
        int tamaño_máximo; // no es correcto porque tiene una tilde
        // int peso.maximo; // no es correcto porque tiene un punto
        int Precio__;
        // int matrícula?; // no es correcto porque tiene una tilde y un interrogante
        // int cuántoVale; // no es correcto porque tiene una tilde
        int high;
        // int barça; // no es correcto porque tiene una "ç" que es un carácter especial
        // int piragüista; // no es correcto porque tiene una "ü" que carácter especial
        int B_011;
        int X012AB;
        // int 70libro; // no es correcto porque empieza con un número
        // int nombre&apellido; // no es correcto porque tiene un carácter especial
        // int 0X1AB; // no es correcto porque empieza con un número
        // int else; // no es correcto porque es una palabra reservada
        // INDENTIFICA LOS IDENTIFICADORES CORRECTOS

        double litearl1 = 0.5;
        System.out.println(litearl1);
        double literal2 = .5;
        System.out.println(literal2);
        double literal3 = 9.3e12;
        System.out.println(literal3);
        double literal4 = 9.3e-12;
        System.out.println(literal4);
        int literal5 = 12345678;
        System.out.println(literal5);
        //int 12345678_L; no es correcto porque lleva un caracter especial antes de la "L"
        // double literal7 = 08E+0.8; es incorrecto porque es un double mal formado
        // double literal8 = 0.8E 8 // 0x.8; es incorrecto porque es un double mal formado y hay un espacio entre el número y la "E"
        int literal9 = 05_15;
        System.out.println(literal9);
        // int lit10 = 018CDF; // es incorrecto porque el 8 y el 9 no son octales
        int literal11 = 0XBC5DA;
        System.out.println(literal11);
        int literal12 = 0x87e3a;
        System.out.println(literal12);
        long literal13 = 234567L;
        System.out.println(literal13);
        int literal14 = 0B11; 
        System.out.println(literal14);
        int literal15 = 010101;
        System.out.println(literal15);
        int literal16 = 0_557; 
        // int literal17 = .00.8E2; // es incorrecto porque tiene dos puntos
        float literal18 = .3e3f;
        System.out.println(literal18);
        int literal19 = 0b111;
        System.out.println(literal19);
        long literal20 = 12_234L;
        System.out.println(literal20);
        int literal21 = 0Xabcd;
        System.out.println(literal21);
        long literal22 = 0xabcEL;
        System.out.println(literal22);
        // int literal23 = _234; // Es incorrecto porque no puede empezar con un guión bajo
         // int literal24 = 1010B; // es incorrecto porque la B no va al final y empieza por 1 y debe empezar con 0b y para ser un hexadecimal debería empezar con "0X"
        int literal25 = 0x1010B;
        System.out.println(literal25);
        double literal26 =  1_234.2E-2;
        System.out.println(literal26);
        //float literal27 = 1234.2Ef; //es incorrecto porque la en la "E" le falta el exponente
        float literal28 = 1234.2E3F;
        System.out.println(literal28);
        //double literal29 = 1_1.2e_2; // es incorrecto porque la e no puede ir sin exponente y el guión no puede ir después de la e
        // int literal30 = 0BABCDL; // es incorrecto porque el es un long que termina con "L", junto a un entero binario que empieza con 0B y con entero hexadecimal 
        int literal31 = 0X1A;
        System.out.println(literal31);
        // int literal32 = 0X12AL; // No es correcto porque tiene el prefijo de un hexadecimal (int) y termina con L de un long
        //int literal33 = abcd; // No es correcto porque porque no tiene el prefijo de un hexadecimal
        int literal34 = 0125;
        System.out.println(literal34);
        double literal35 = .01011;
        System.out.println(literal35);
        double literal36 = 3e12;
        System.out.println(literal36);
         //double literal37 = 3_e12; // no se puede separar el numero 3 del exponencial con un guión bajo
        double literal38 = -3E-1_2;
        System.out.println(literal38);
        // double literal39 = 0.8E; // no es correcto porque le falta el exponente
        // int literal40 = 0B1212; // no es correcto porque el 2 no es un número binario
        int literal41 = 1_2_3;
        System.out.println(literal41);
        int literal42 = 0xedad;
        System.out.println(literal42);
        int literal43 = 0XBE2;
        System.out.println(literal43);
        double literal44 = 101e2;
        System.out.println(literal44);
        //int literal45 = B1101; // No es correcto porque primero va un 0 y luego la B
        // double literal46 = 1.34.5; // no es correcto porque tiene dos puntos
        float literal47 = 12.3E4F;
        System.out.println(literal47);
        // int literal48 = 0X12AG; // No es correcto porque la G no es un número hexadecimal


        
        // Exercicis de literals del tipus “char”

        char letra1 = 'a';
        char letra2 = '$';
        char letra3 = '\n';
        // char letra4 = '/n'; // es incorrecta porque la barra debe ser invertida
        char letra5 = '\\';
        //char letra6 = '\ñ'; // es un escape inválido
        // char letra7 =2 "1"; // es incorrecta porque tiene que ir con comillas simples
        char letra8 = 'ñ'; 
        // char letra9 = 'xyz' // es invalido porque no puede tener más de un carácter
        char letra10 = '\u0066';
        // char letra11 = 'XYZ' // es invalido porque no puede tener más de un carácter
        char letra12 = 4;
        char letra13 = '\t';
        char letra14 = '\b';
        // char letra15 = k; // no es corercta porque debe ir entre comillas simples
        // char letra16 = +; // no es corercta porque debe ir entre comillas simples
        char Letra17 = '+';
        char letra18 = '?';
        char letra19 = 'â';
        char letra20 = ':';



        // Exercicis sobre strings



        // String palabraA = '8:15 P.M.'; // no es correcto porque las comillas no tienen que ser simples
        String palabraB = "Rojo, Blanco y Azul"; 
        // String palabraC = "Nombre; no es correcto porque le falta la comilla de cierre
        String PalabraD = "Capítulo \'3\'";
        String PalabraE ="1.3e-1-2";
        String PalabraF = "";
        String Palabrag = " ";
        String PalabraH = "A";
        //String palabraI = "FP'; // no es correcto porque las comillas no son iguales
        String palabraJ = "programación";
        // String palabraK = "Programación "Java""; // Es incorrecto, para ponerle comillas a la palabra Java, tenemos que ponerle una barra invertida y comillas simples de esta forma \'Java\'
        // String palabraL = Programación; // Es incorrecto porque debe de ir entre comillas dobles
        // String palabraM = 'W'; // Es incorrecto porque debe de ir entre comillas dobles
        String PalabraN = "\n";
        String PalabraO = "4 + 5 * 2";

        
        
        //Declara les següents variables

        int p = 2; 
        System.out.println(p);
        int q = 3;
        System.out.println(q);
        float x = 2.5f;
        System.out.println(x);
        float y = 3.5f;
        System.out.println(y);
        double z = 3.5;
        System.out.println(z);
        char a = 'r';
        System.out.println(a);
        char b = 't';
        System.out.println(b);
        char c = 'h';
        System.out.println(c);
        double raiz1 = 3.13;
        System.out.println(raiz1);
        double raiz2 = 4.56;
        System.out.println(raiz2);
        long contador = 123456789L;
        System.out.println(contador);
        short indicador = 12345;
        System.out.println(indicador);
        int indice = 15;
        System.out.println(indice);
        double precio = 19.95;
        System.out.println(precio);
        double precioFinal = 29.95;
        System.out.println(precioFinal);
        int car1 = 20;
        System.out.println(car1);
        int car2 = 30;
        System.out.println(car2);
        byte valor = 127;
        System.out.println(valor);
        boolean primero = true;
        System.out.println(primero);
        boolean ultimo = false;
        System.out.println(ultimo);
        String nombre = "Ángel";
        System.out.println(nombre);

        
    //Declara aquestes variables

        int edad = 21;
        System.out.println(edad);
        double altura = 1.95;
        System.out.println(altura);
        String nombre1 = "Ángel";
        System.out.println(nombre1);
        double IVA = 1.21;
        System.out.println(IVA + 15.00);
        double peso = 55.5;
        System.out.println(peso);
        boolean alumnoRepetidor = true;
        System.out.println(alumnoRepetidor);
        char letra = 'f';
        System.out.println(letra);
        int minutos = 90;
        System.out.println(minutos);
        int matriculaCoche = 0X423ABC;
        System.out.println(matriculaCoche);
        boolean mayorDeEdad = true;
        System.out.println(mayorDeEdad);
        boolean mayorDeEdad2 = false;
        System.out.println(mayorDeEdad2);
        int codigoPostal = 07011;
        System.out.println(codigoPostal);
        char genero = 'M';
        System.out.println(genero);
        char genero2 = 'M';
        System.out.println(genero2);
        int númeroDeHijos = 4 ;
        System.out.println(númeroDeHijos);
        int tallaCamisa = 5;
        System.out.println(tallaCamisa);
        double precio1 = 19.95;
        System.out.println(precio1);
        String mensaje = "Minecraft en verdad es super fácil";
        System.out.println(mensaje);
        int mayorEdad = 19;
        System.out.println(mayorEdad);
        int días = 365;
        System.out.println(días);
        double contador2 = 30.0;
        System.out.println(contador2);
        String tallaCamiseta = "XXL";
        System.out.println(tallaCamiseta);
    

    //Por aquí van las operaciones estás algebraicas que tengo que hacer

        double B1 = 3.0;
        double A1 = 8.0;
        double C1 = 5.0;
        double D1 = 9.0;
        double X2 = 6.0;
        double Y2 = 7.0;
        double Z2 = 4.0;
        double E1 = 2.0;
        double F1 = 7.0;
        double G1 = 8.0;
        double H1 = 4.0;
        double J1 = 3.0;
        double M1 = 2.0;
        double N1 = 5.0;
        double P1 = 8.0;
        double Q1 = 4.0;
        double R1 = 3.0;
        double S1 = 2.0;

    //Primera actividad de convertir expresiones algebraicas a algoritmicas
        System.out.println((B1 / 2.0) - (4.0 * A1 * C1)); // Número a
        System.out.println((3.0 * X2 * Y2) - ( 5.0 * X2) + (12.0 *X2) -17.0); // Número b
        System.out.println((B1 + D1) / (C1 + 4)); // Número c
        System.out.println(((X2 * Y2) / Y2) + 2.0); // Número d
        System.out.println((1.0 / Y2) + ((3.0 * X2) / Z2) + 1.0); // Número e
        System.out.println((1.0 / (Y2 + 3.0)) + (X2 / Y2)); // Número f
        System.out.println((1.0/Y2) + ((3 + X2) / (Y2 + 1))); // Número g
        
    
        //Segunda actividad de convertir expresiones algebraicas a algoritmicas
        System.out.println( (3.0 / 2.0 ) + ( 4.0 / 3.0) ); // Número a
        System.out.println(( 1.0 / ( X2 - 5.0)) - (( 3.0 * X2 * Y2 ) / 4.0 )); // Número b
        System.out.println((1.0 / 2.0) + 7.0); // Número c
        System.out.println(7.0 + ( 1.0 / 2.0)); // Número d
        System.out.println(((A1 * A1) / (B1 - C1)) + ((D1 - E1) / (F1 - ((G1 * H1) / J1)))); // Número e
        System.out.println((M1 / N1) + P1); // Número f
        System.out.println(M1 + (N1 / (P1 - Q1))); // Número g
        System.out.println(((A1 * A1) / (B1 * B1)) + ((C1 * C1) / (D1 * D1))); // Número h
        System.out.println(( M1 + (N1 / P1)) / ( Q1 - ( R1 / S1 ))); // Número i
        System.out.println((((3.0 * A1) + B1) / (C1 - (D1 + ( 5.0 * E1 )) / (F1 + (G1 / (2.0 * H1)))))); // Número j
        System.out.println(((A1 * A1) + (2.0 * A1 * B1) + (B1 * B1)) / (( 1.0 / (X2 * X2)) + 2.0 )); // Número k
        

    // Si a, b y c son variables senceres amb valors a=8, b=3, c=-5, determina el valor de les següents expressions aritmètiques

        int a1 = 8;
        int b1 = 3;
        int c1 = -5;
        System.out.println( a1 + b1 + c1); // Número a
        System.out.println( 2.0 * b1 + 3.0 * (a1 - c1)); // Número b
        System.out.println( a1 / c1 ); // Número c
        System.out.println( a1 % b1 ); // Número dsadasd    
        System.out.println( a1 / c1 ); // Número e
        System.out.println( a1 % c1 ); // Número f
        System.out.println( a1 * b1 / c1 ); // Número g
        System.out.println( a1 * (b1 / c1) ); // Número h
        System.out.println( (a1 + c1) % b1 ); // Número i
        System.out.println( a1 * ( c1 % b1 )); // Número j
        System.out.println( (3.0 * a1 - 2.0 * b) % (2.0 * a1 - c1)); // Número k
        System.out.println( 2 * (a1 / 5.0 + (4.0 -b1 * 3.0)) % (a1 + c1 - 2.0)); // Número l
        System.out.println( (a1 - 3.0 * b1) % (c1 + 2.0 * a1) / (a1 - c1) ); // Número m    
        System.out.println( a1 - b1 - c1 * 2.0 ); // Número n


    
    /*Si x, y, z son variables de tipus double amb valors x= 88, y = 3.5, z = -5.2,
    determina el valor de les següents expressions aritmètiques. Obtén el resultat
    de cada expressió amb un màxim de quatre decimals. */

        double x1 = 88.0;
        double y1 = 3.5;
        double z1 = -5.2;
        System.out.println( x1 + y1 + z1 ); // Número a
        System.out.println( 2.0 * y1 + 3.0 * (x1 - z1)); // Número b
        System.out.println( x1 / y1 ); // Número c
        System.out.println( x1 % y1 ); // Número d
        System.out.println( x1 / ( y1 + z1 )); // Número e
        System.out.println( (x1 / y1) + z1); // Número f
        System.out.println( 2.0 * x1 / 3.0 * y1); // Número g
        System.out.println( x1 * (y1 / z1) ); // Número h
        System.out.println( x1 * y1 % z1 ); // Número j
        System.out.println(2.0 * x1 / (3.0 * y1)); // Número i
        System.out.println(3.0 * x1 - z1 - 2.0 * x1); // Número k
        System.out.println(2.0 * x1 / 5.0 % y1); // Número l
        System.out.println(x1 - 100.0 % y1 % z1); // Número m
        System.out.println(x1 - y1 - z1 * 2.0); // Número n
       
    
    // Determina quin és el tipus de data del resultat de les següents expressions aritmètiques:
        byte B = 8;
        short s = 16;
        long ln = 64L;
        int i, j;
        i = 8;
        j = 12;
        float f = 4.0f;
        double d = 8.0;
        char C = 'a';
        System.out.println( i + C); // Número a
        System.out.println( f - C);  // Número b
        System.out.println( d * f); // Número c
        System.out.println( d / i); // Número d
        System.out.println( i / f); // Número e
        System.out.println( s / j); // Número f
        System.out.println( d + j); // Número g
        System.out.println( s * C); // Número h
        System.out.println( d + C); // Número i
        System.out.println( B + C); // Número j
        System.out.println( B / C + s); // Número k
        System.out.println( C + C); // Número l
        System.out.println( i + ln + d); // Número m
        System.out.println( ln + C); // Número n
        System.out.println( 5 / j); // Número o
        System.out.println( 5.2 / j); // Número p
        System.out.println( i * f * 2.5); // Número q
        System.out.println(ln * f * 2.5F); // Número r
        System.out.println(j - 4L); // Número s
        System.out.println( j - 4L * 2.5F); // Número t
        System.out.println( B + 2.5 * i + 35F); // Número u
        System.out.println( 'a' + B); // Número v
        System.out.println('a' + C); // Número w
        System.out.println( C + 2); // Número x
        System.out.println( C - ln / 2); // Número y
        System.out.println( 2 / i + 2.0 / j); // Número z

    // Si X, Y y Z son variables de tipus boolean amb valors X = true, Y = false, Z = true, determina el valor de les següents expressions lògiques:

        boolean X = true;
        boolean Y = false;
        boolean Z = true;
        System.out.println((X && Y) || (X && Z)); // Número a
        System.out.println((X || !Y)&& (!X || Z)); // Número b
        System.out.println(X || Y && Z); // Número c
        System.out.println((X || Y) && Z); // Número d
        System.out.println(X || Y || X && !Z && !Y); // Número e
        System.out.println(!X || !Y || Z && X && !Y); // Número f

    
    //Si W, X i Y son variables de tipus boolean amb valors W = false, X = true, Y = true, Z = false,  determina el valor de les següents expressions lògiques:

        boolean W = false;
        boolean X1 = true;
        boolean Y1 = true;
        boolean Z1 = false;
        System.out.println(W || Y1 && X1 && W || Z1); // Número a
        System.out.println(X1 && !Y1 && !X1 || Z1 || X1); // Número b
        System.out.println(!(W || !Y1) && X1 || Z1); // Número c
        System.out.println(X1 && Y1 && W || Z1 ||X1); // Número d
        System.out.println(Y1 || !(Y1 ||Z1 && W)); // Número e
        System.out.println(!X1 && Y1 && (!Z1 || !X1));
        
    //Determina el valor de les següents expressions:
        int I1 = 8, J2 = 5;
        float X3 = 0.005F, Y3 = -0.01F;
        char C2 = 'a', D = '4';
        System.out.println( I1 <= J2 ); // Número a
        System.out.println(C2 > D ); // Número b
        System.out.println(X3 >= 0 ); // Número c
        System.out.println(X3 < Y3-- ); // Número d
        System.out.println(J1 != 6); // Número e
        System.out.println(C2 == 99); // Número f
        System.out.println(!(I1 <= J2)); // Número g
        System.out.println(!(C2 == 99)); // Número h
        System.out.println(!(X3> 0)); // Número i
        System.out.println(-J2 == I1 - 13 ); // Número j
        System.out.println( C2 > D || C2 > 0); // Número k
        System.out.println( Y3-- < 1); // Número l
        System.out.println( C2 > D || C2 > 0); // Número m
        System.out.println(5 * (I1 + J2) > 'c'); // Número n
        System.out.println(2 * X3 + Y3 == 0); // Número o
        // System.out.println(2 * X3 + (Y3 == 0)); // Número p Da error porque intentamos hacer operaciones con un boolean y un float
        System.out.println(X3 + Y3  >= 0); // Número q
        System.out.println(X3 < ++Y3); // Número r
        System.out.println(- (I1 + J2) != -I1 + J2); // Número s
        System.out.println(I1 <= J2 && I1 >= C2); // Número t
        System.out.println(I1 > 0 && J2 < 5); // Número u
        System.out.println(I1 > 0 || J2 < 5); // Número v
        System.out.println(X3 > Y3 && I1 > 0 || J2 < 5); // Número w
        System.out.println((3 * I1 - 2 * J2) % (2 * D - C2) > 3 * D); // Número x
        System.out.println(2 * ((I1 / 5) + (4 * (J2 - 3)) % (I1 + J2 - 2)) >= 10); // Número y
        System.out.println((I1 - 3 * J2) % (C2 + 2 * D) / (X3 - Y3) >= 0); // Número z
    }
        }