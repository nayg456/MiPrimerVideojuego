

import java.util.Scanner;
/**
 * Esta clase representa la lógica del juego Piedra, Papel, Tijera.
 * El jugador compite contra la computadora durante 5 rondas, intentando ganar o perder según el objetivo establecido.
 * Se muestra un mensaje de intento de ganar o perder al comienzo de cada ronda.
 * Después de las 5 rondas, se muestra el tiempo tomado y se calcula el tiempo final considerando posibles penalizaciones.
 * Las opciones de la computadora (tijera, papel, piedra) se generan aleatoriamente.
 * Se utiliza una representación ASCII artística para visualizar las opciones.
 * El jugador ingresa su elección utilizando la entrada estándar.
 * Se compara la elección del jugador con la de la computadora para determinar el resultado de cada ronda.
 * Los métodos tijera(), papel() y piedra() imprimen la representación ASCII de las opciones correspondientes.
 * 
 * @author nay
 */

public class MiPrimerVideojuego {

    /**
     * Método principal que inicia el juego.
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
     
        public static void main(String[] args) {
// TODO code application logic here
            int chiquipuntos = 0;
            Scanner sc = new Scanner(System.in);
            String opcionJugador = "";
            String opcionBot = "";
            int exitoEnProposito = 1;
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 5; i++) {
                int proposito = (int) Math.floor(Math.random() * 2 + 1);
               
                    if (proposito == 1) {
                        System.out.println("\n\tIntenta ganar");
                    }
                    if (proposito == 2) {
                        System.out.println("\n\tIntenta perder");
                    }
                    int j = (int) Math.floor(Math.random() * 3 + 1);
                    if (j == 1) {
                        opcionBot = "tijera";
                        System.out.println(opcionBot);
                        tijera();
                    }
                    if (j == 2) {
                        opcionBot = "papel";
                        System.out.println(opcionBot);
                        papel();
                    }
                    if (j == 3) {
                        opcionBot = "piedra";
                        System.out.println(opcionBot);
                        piedra();
                    }
                    do {
                        System.out.println("Introduce tu jugada");
                        opcionJugador = sc.nextLine();
                        if (opcionBot.equals(opcionJugador)) {
                            System.out.println("No tiene sentido que intentes empatar");
                        }
                    } while (opcionBot == opcionJugador);
                    if (opcionJugador.equals("tijera") && (opcionBot.equals("papel"))) {
                        exitoEnProposito = 1;
                    }
                    if (opcionJugador.equals("papel") && (opcionBot.equals("tijera"))) {
                        exitoEnProposito = -1;
                    }
                    if (opcionJugador.equals("tijera") && (opcionBot.equals("piedra"))) {
                        exitoEnProposito = -1;
                    }
                    if (opcionJugador.equals("piedra") && (opcionBot.equals("tijera"))) {
                        exitoEnProposito = 1;
                    }
                    if (opcionJugador.equals("piedra") && (opcionBot.equals("papel"))) {
                        exitoEnProposito = -1;
                    }
                    if (opcionJugador.equals("papel") && (opcionBot.equals("piedra"))) {
                        exitoEnProposito = 1;
                    }
                    if (proposito == 2) {
                        exitoEnProposito *= -1;
                    }
                    if (exitoEnProposito == 1) {
                        chiquipuntos++;
                    }
                }
                long fin = System.currentTimeMillis();
                
                double tiempo = (double) ((fin - inicio) / 1000);
                System.out.println("Has realizado el ejercicio en " + tiempo + " segundos");
                int nFallos = 5 - chiquipuntos;
                System.out.println("Penalización: " + nFallos + " x 5s = " + nFallos * 5);
                double tiempoFinal = tiempo + nFallos * 5;
                System.out.println("Tu tiempo final es de " + tiempoFinal + " segundos");
               
     /**
     * Método que muestra la representación ASCII de una tijera.
     */
            public static void tijera() {
                System.out.println("'''\n"
                        + " _______\n"
                        + "---' ____)____\n"
                        + " ______)\n"
                        + " __________)\n"
                        + " (____)\n"
                        + "---.__(___)\n"
                        + "'''");
            }
     /**
     * Método que muestra la representación ASCII de un papel.
     */
            
            public static void papel() {
                System.out.println("'''\n"
                        + " _______\n"
                        + "---' ____)____\n"
                        + " ______)\n"
                        + " _______)\n"
                        + " _______)\n"
                        + "---.__________)");
            }
     /**
     * Método que muestra la representación ASCII de una piedra.
     */
           
           
            public static void piedra() {
                System.out.println("'''\n"
                        + " _______\n"
                        + "---' ____)\n"
                        + " (_____)\n"
                        + " (_____)\n"
                        + " (____)\n"
                        + "---.__(___)\n"
                        + "'''");
            }
        }
