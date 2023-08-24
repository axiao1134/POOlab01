import java.util.Scanner;
import java.util.Random;
public class JuegoCartas {
    public static void main(String[] args) {
    String[][] matriz= crearMatrizCartas();


        }


    public static String[][] crearMatrizCartas(){
        String[][] matrizDeCartas= new String[12][2];
        return matrizDeCartas;
    }
    public static String[][] agregarCartas(String [][] cartas){
        Scanner scanner=new Scanner(System.in);
        for (int fila=0;fila<cartas.length;fila++){
            cartas[fila][0]= scanner.nextLine();
            cartas[fila][1]=scanner.nextLine();
            }
        return cartas;
        }
    public static String[][] obtenerCarta(String[][] cartas){
        Random random = new Random();
        int filaAleatoria = random.nextInt(cartas.length);

        String[][] carta = new String [2][1];
        carta [0][0] = cartas[filaAleatoria][0];
        carta [1][0] = cartas[filaAleatoria][1];




    return carta;
    }
    /* como esta parte no esta completo lo dejo como comentario para no alterar el funcionnamiento del programa

    public static String[][] Jugar(){
        for (int contaodr=0;contaodr<3;contaodr++){
        }

    }

    */





}
