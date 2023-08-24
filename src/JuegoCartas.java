import java.util.Scanner;
public class JuegoCartas {
    public static void main(String[] args) {
    String[][] matriz= crearMatrizCartas();
    String[][] matriz1=agregarCartas(matriz);
        System.out.println(matriz1);

    }
    public static String[][] crearMatrizCartas(){
        String[][] matrizDeCartas= new String[2][12];
        return matrizDeCartas;
    }
    public static String[][] agregarCartas(String cartas[][]){
        Scanner matriz = new Scanner(System.in);
        for (int fila=0;fila<2;fila++){
            matriz[fila][o]= matriz.nextLine();
            matriz[fila][1]=matriz.nextLine();
            }
        return cartas;
        }



    }

}
