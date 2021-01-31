import java.util.Scanner;
public class bai3pp {
    public static void main (String []args){
       Scanner sc = new Scanner (System.in);
       String name = sc.nextLine();
       int n = sc.nextInt();
       if (n < 16){
           System.out.println(" Ban " + name + " o do tuoi vi thanh nien ");

       }else if (n >= 16 && n < 18){
           System.out.println("Ban " + name + " o do tuoi truong thanh ");

       }else {
           System.out.println(" Ban " + name + " da gia ");
       }
            
        }
        
    }
