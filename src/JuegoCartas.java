import java.util.Scanner;
public class JuegoCartas {
    public static void main(String[] args) {
    String[][] matriz= crearMatrizCartas();

        }


    public static String[][] crearMatrizCartas(){
        String[][] matrizDeCartas= new String[2][12];
        return matrizDeCartas;
    }
    public static String[][] agregarCartas(String [][] cartas, String nombre, String puntaje){

        for (int fila=0;fila<cartas.length;fila++){
            cartas[fila][0]= nombre;
            cartas[fila][1]= puntaje;
            }
        return cartas;
        }





}
