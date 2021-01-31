import java.util.Scanner;
public class bai2pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println (n + " la so chan " );

        }else {
            System.out.println(n + " la so le " );
        }
    }
    
}

