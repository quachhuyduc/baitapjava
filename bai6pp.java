import java.util.Scanner;
public class bai6pp {
    public static void main(String []args){
       
        int n;
        int temp = 1;
        long giaithua = 1;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("Nhap vao mot so nguyen duong: ");
                n = sc.nextInt();

        }
        while (( n <= 0 ) || (n > 10));
        while ( temp <= n ){
            giaithua *= temp;
            temp++; 
        }
        System.out.println(n + " ! = " + giaithua);
    }
}
