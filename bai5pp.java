import java.util.Scanner;
public class bai5pp {
    public static void main(String[] args) {
        int sum = 0, number;
        Scanner scanner = new Scanner(System.in);
             
        do {
            System.out.println("Nhập vào số:");
            number = scanner.nextInt();
            sum += number;
                 
          
            if (sum > 100)
                break;
        } while (number > 0);
             
        System.out.println("Tổng = " + sum);
    }
}