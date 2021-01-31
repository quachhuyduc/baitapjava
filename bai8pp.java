import java.util.Scanner;
public class bai8pp {
    public static void main(String []args) {
    
        int n, sum = 0, number;
    
        float tbcong;
        Scanner sc = new Scanner (System.in);

        System.out.println("nhap vao so cac phan tu trong day: ");
        n = sc.nextInt();
        for (int dem = 1; dem <= n; dem++){

        System.out.println("nhap so thu " + dem );
        number = sc.nextInt();
        sum += number;
        }
        tbcong = (float) sum / n;
        System.out.println ("Trung binh cong = " + tbcong);
    }
}
