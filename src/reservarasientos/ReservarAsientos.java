package reservarasientos;

import java.util.Scanner;

/**
 *
 * @author arnol
 */
public class ReservarAsientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        char asientos [][] = new char [10][10];
        boolean selector = false;
        Scanner user = new Scanner(System.in);
        int fila = 0, asiento = 0;
        int respuesta;
        
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            } 
        }
        //Bienvenido al sistema
        System.out.println("--------------------------------------");
        System.out.println("Bienvenido al sistema de reservaciones");
        System.out.println("--------------------------------------");
        //Mostrar asientos 
        while(selector!=true){
            System.out.println("Desea ver los asientos disponibles? 0:Si 1:No ");
            respuesta = user.nextInt();
            if (respuesta == 0) {
                mostrarAsientos(asientos); //Llamamos al metodo de mostrar asientos
            }
            //validar que el asiento exista en el rango del array
            boolean validacion = false;
            while(validacion !=true){
                System.out.println("");
                System.out.println("Ingrese la fila y el asiento a reservar");
                System.out.print("Selecciona una fila (entre 0 y 9): ");
                fila = user.nextInt();
                System.out.print("Selecciona un asiento (entre 0 y 9): ");
                asiento = user.nextInt();
                if (fila<=9 && asiento>=0) {
                    if (asiento<=9 && asiento>=0) {
                        validacion = true;
                    }else{
                        System.out.println("El numero de asiento no es valido");
                    }
                }else{
                    System.out.println("El numero de fila no es valido");
                }
            }
            //Marcar de libre o ocupado      
            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente ");
            }else{
                System.out.println("El asiento se encuentra ocupado, elije otro");
            }
            System.out.println("Desea reservar otro asiento? 0:Si 1:No");
            respuesta = user.nextInt();
            if (respuesta == 1) {
                selector = true;
            }else{
                selector = false;
            }
        }  
    }
    //Metodo para mostrar o dibujar la matriz
    static void mostrarAsientos(char asientos[][]){  //static comparte la funcion con toda la clase
        for (int f = 0; f < 10; f++) {
            System.out.print(f + "");
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "] ");
            } 
            System.out.println("");
        }  
    } 
}
