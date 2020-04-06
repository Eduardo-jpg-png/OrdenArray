package ordenarray;
import java.util.*;
public class OrdenArray {
    static Scanner teclado = new Scanner (System.in);
    static int arreglo[ ], nums, posi, aux;
public static void main(String[] args) {
    
    ordenArray();
}
    public static void ordenArray(){
        System.out.println(" Inserta el numero de elementos: ");
        nums = teclado.nextInt();
        
        arreglo = new int [nums];
        
        System.out.println(" Digite el arreglo: ");
        for (int i=0; i<nums; i++){
            System.out.print((i+1)+" Digite un numero: ");
            arreglo [i] = teclado.nextInt();
        }
        for (int i=0; i<nums; i++){
            posi = i;
            aux = arreglo[i];
            
            while ((posi>0) && (arreglo[posi-1] > aux)){
                arreglo [posi] = arreglo [posi-1];
                posi--;
            }
            arreglo [posi] = aux;
        }
        System.out.print("Orden mayor a menor: ");
        for (int i=(nums-1);i>=0;i--){
            System.out.print(arreglo [i]+ " - ");
            
        }
    } 
}
