
import java.sql.SQLOutput;
import java.util.Scanner;
public class BatallaNaval {
    static int tablero1[][];
    static int tablero2[][];
    static int filas, columnas;
    static String j1, j2;

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el numero de filas");
        filas = leer.nextInt();
        System.out.println("Ingresa el numero de columnas");
        columnas = leer.nextInt();
        tablero1 = new int[filas][columnas];
        tablero2 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero1[i][j] = 0;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero2[i][j] = 0;
            }
        }


        System.out.println("Ingresa nombre del jugador 1");
        j1 = leer.next();
        barcosJug1();

        System.out.println("Ingresa nombre del jugador 2");
        j2 = leer.next();
        barcosJug2();

        Tiros();


    }


    public static void barcosJug1() {
        String psc;
        System.out.println("Bienvenido Jugador " + j1);

        System.out.println("Ingresa la posicion de tu primer barco Horizontal/Vertical");
        psc = leer.next();


        if (psc.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas && cordY >= 0 && cordY < columnas ) {
                for (int i = 0; i < 4; i++) {
                    tablero1[cordX][cordY + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas  && cordY >= 0 && cordY < columnas) {
                for (int i = 0; i < 4; i++) {
                    tablero1[cordX + i][cordY] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        System.out.println("Ingresa la posicion de tu segundo barco Horizontal/Vertical");
        psc = leer.next();


        if (psc.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas && cordY >= 0 && cordY < columnas ) {
                for (int i = 0; i < 3; i++) {
                    tablero1[cordX][cordY + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas  && cordY >= 0 && cordY < columnas) {
                for (int i = 0; i < 3; i++) {
                    tablero1[cordX + i][cordY] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        System.out.println("Ingresa la posicion de tu tercer barco Horizontal/Vertical");
        psc = leer.next();


        if (psc.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas && cordY >= 0 && cordY < columnas) {
                for (int i = 0; i < 2; i++) {
                    tablero1[cordX][cordY + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas  && cordY >= 0 && cordY < columnas) {
                for (int i = 0; i < 2; i++) {
                    tablero1[cordX + i][cordY] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }




        System.out.println("Ingresa la posicion de tu cuarto barco Horizontal/Vertical");
        psc = leer.next();


        if (psc.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas && cordY >= 0 && cordY < columnas ) {
                for (int i = 0; i < 1; i++) {
                    tablero1[cordX][cordY + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }



        if (psc.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY = leer.nextInt();
            if (cordX >= 0 && cordX < filas  && cordY >= 0 && cordY < columnas) {
                for (int i = 0; i < 1; i++) {
                    tablero1[cordX + i][cordY] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero1[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }
    }

    public static void barcosJug2(){
        String psc2;
        System.out.println("Bienvenido Jugador " + j2);

        System.out.println("Ingresa la posicion de tu primer barco Horizontal/Vertical");
        psc2 = leer.next();


        if (psc2.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();
            if (cordX2 >= 0 && cordX2 < filas && cordY2 >= 0 && cordY2 < columnas ) {
                for (int i = 0; i < 4; i++) {
                    tablero2[cordX2][cordY2 + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc2.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();
            if (cordX2 >= 0 && cordX2 < filas && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 4; i++) {
                    tablero2[cordX2 + i][cordY2] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        System.out.println("Ingresa la posicion de tu segundo barco Horizontal/Vertical");
        psc2 = leer.next();


        if (psc2.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();

            if (cordX2 >= 0 && cordX2 < filas && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 3; i++) {
                    tablero2[cordX2][cordY2 + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc2.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();
            if (cordX2 >= 0 && cordX2 < filas  && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 3; i++) {
                    tablero2[cordX2 + i][cordY2] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        System.out.println("Ingresa la posicion de tu tercer barco Horizontal/Vertical");
        psc2= leer.next();


        if (psc2.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();
            if (cordX2 >= 0 && cordX2 < filas && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 2; i++) {
                    tablero2[cordX2][cordY2 + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc2.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();
            if (cordX2 >= 0 && cordX2 < filas  && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 2; i++) {
                    tablero2[cordX2 + i][cordY2] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }
            }

        }




        System.out.println("Ingresa la posicion de tu cuarto barco Horizontal/Vertical");
        psc2 = leer.next();


        if (psc2.equalsIgnoreCase("h")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();

            if (cordX2 >= 0 && cordX2< filas && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 1; i++) {
                    tablero2[cordX2][cordY2 + i] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }
        if (psc2.equalsIgnoreCase("v")) {
            System.out.println("Ingresa la coordenada de tu barco en horizontal");
            int cordX2 = leer.nextInt();

            System.out.println("Ingresa la coordenada de tu barco en vertical");
            int cordY2 = leer.nextInt();
            if (cordX2 >= 0 && cordX2 < filas  && cordY2 >= 0 && cordY2 < columnas) {
                for (int i = 0; i < 1; i++) {
                    tablero2[cordX2 + i][cordY2] = 7;
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(tablero2[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }



    }

    public static void Tiros(){
        for (int i = 0; i<tablero1.length; i++)
            for (int j = 0; j<tablero1.length-1; j++)

                for (int k = 0; k< tablero2.length;k++)
                    for (int g = 0; g<tablero2.length-1;g++)

                        while (tablero1[i][j]==7 && tablero2[k][g]==7){
                            System.out.println("Turno del jugador " + j1);
                            System.out.println("Ingresa fila a tirar");
                            int Shotf= leer.nextInt();

                            System.out.println("ingresa Columna a tirar");
                            int Shotc= leer.nextInt();

                            if (Shotf>=0 && Shotf<filas && Shotc>=0 && Shotc<columnas){
                                if (tablero2[Shotf][Shotc]==7){
                                    System.out.println("Hundiste un buque");
                                    for (int z = 0; z<filas; z++){
                                        for (int h = 0; h<columnas; h++){
                                            tablero2[Shotf][Shotc]=2;
                                        }
                                    }
                                } else if (tablero2[Shotf][Shotc]==0){
                                    System.out.println("No le diste a ningún buque");
                                    for (int z = 0; z<filas; z++){
                                        for (int h = 0; h<columnas; h++){
                                            tablero2[Shotf][Shotc]=2;
                                        }
                                    }
                                  } else if (tablero2[Shotf][Shotc]==2){
                                    System.out.println("Esta posición ya ha sido bombardeada");

                                    }


                            }

                            System.out.println("Turno del jugador " + j2);
                            System.out.println("Ingresa fila a tirar");
                            Shotf= leer.nextInt();

                            System.out.println("ingresa Columna a tirar");
                            Shotc= leer.nextInt();

                            if (Shotf>=0 && Shotf<filas && Shotc>=0 && Shotc<columnas){
                                if (tablero1[Shotf][Shotc]==7){
                                    System.out.println("Hundiste un buque");
                                    for (int z = 0; z<filas; z++){
                                        for (int h = 0; h<columnas; h++){
                                            tablero1[Shotf][Shotc]=1;
                                        }
                                    }
                                } else if (tablero1[Shotf][Shotc]==0){
                                    System.out.println("No le diste a ningún buque");
                                    for (int z = 0; z<filas; z++){
                                        for (int h = 0; h<columnas; h++){
                                            tablero1[Shotf][Shotc]=2;
                                        }
                                    }
                                } else if (tablero1[Shotf][Shotc]==1){
                                    System.out.println("Esta posición ya ha sido bombardeada");

                                }
                            }

                        }

        //GANADORES

        for (int i = 0; i<tablero1.length; i++)
            for (int j = 0; j<tablero1.length-1; j++)

                for (int k = 0; k< tablero2.length;k++)
                    for (int g = 0; g<tablero2.length-1;g++)

                        if (tablero1[i][j]==7 || tablero2[k][g]==7) {
                            if (tablero1[i][j] == 7) {
                                System.out.println("Perdio el jugador" + j2);
                                for (int h = 0; h < filas; h++) {
                                    for (int t = 0; t < columnas; t++) {
                                        System.out.print(tablero1[h][t] + " ");
                                    }
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("Ganaste jugador" + j2);
                                for (int h = 0; h < filas; h++) {
                                    for (int t = 0; t < columnas; t++) {
                                        System.out.print(tablero1[h][t] + " ");
                                    }
                                    System.out.println("");
                                }
                            }
                            if (tablero2[k][g]==7){
                                System.out.println("Perdio el jugador" + j1);
                                for (int h = 0; h < filas; h++){
                                    for (int t = 0; t<columnas; t++){
                                        System.out.print(tablero2[h][t] + " ");
                                    }
                                    System.out.println("");
                                }
                            }else {
                                System.out.println("Ganaste jugador" +j1);
                                for (int h = 0; h < filas; h++){
                                    for (int t = 0; t<columnas; t++){
                                        System.out.print(tablero2[h][t] + " ");

                                    }
                                    System.out.println("");
                                }
                            }
                            return;
                        }





    }
}
