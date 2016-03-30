package jurnalmod8rpl;

import java.util.Scanner;

public class Jurnalmod8rpl {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan angka : ");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println("\n\nAngka fibonacci hanya sampai " + number +" numbers : ");
        for(int i=1; i<=number; i++){
            System.out.print(fibo(i) +" ");
        }
        int yui=i+i;
        System.out.println("\n"+yui);
    } 
     public static int fibo(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibo(number-1) + fibo(number -2);
    }
 

    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; 
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci;
    }     
}
