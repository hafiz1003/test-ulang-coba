
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

// 8,9,7,1
// 0,1,2,3
public class Tugas_2 {
   public static void main (String []args){ 
       int i= 0;
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan = ");
        i = input.nextInt();
        int[] x = new int[i];
        int total =0;
        for (int a=0;a<i;++a){
            System.out.print("Masukkan bilangan ke-"+(a+1)+"=");
            x[a] = input.nextInt();
        }
        int max = x[0];
        int min = x[0];
        for (i=0;i<x.length;++i){
            if (max < x[i]){
                max = x[i];}
      
             if (min > x[i]){
                min = x[i];}
            }
        
        for (i=0;i<x.length;++i){
            total = total + x[i];
           }
        System.out.println("Angka terkecil = "+min);
        System.out.println("Angka terbesar = "+max);
        System.out.println("Total bilangan = "+total);
        
        }        
}

