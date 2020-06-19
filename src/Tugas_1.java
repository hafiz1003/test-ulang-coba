
import java.util.Scanner;



public class Tugas_1 {
    
    public static void main (String []args){ 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah inputan : ");
            int x = input.nextInt();
        
        for (int i = 0; i<x; i++){
            for (int j = 0; j<x; j++){
                if (i == 0 || i == x-1 || j == 0 || j == x-1) {
                    System.out.print(" x ");
                }
                else
                    System.out.print(" + ");
            }
            System.out.println("");
        }

        
       
      
    }
}
