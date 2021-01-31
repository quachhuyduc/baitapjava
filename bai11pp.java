import java.util.Scanner;
public class bai11pp {
    public static void main(String[]args){
        int n, tg;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println ("Nhap so phan tu ");
            n = sc.nextInt();
        }while (n < 1);
        int A[] = new int [n];
        for (int i = 0; i < A.length; i++){
            System.out.println("A[" +(i + 1) + "]");
            A[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
        System.out.println("Sap xep lai la: ");
        for (int i = 0; i < A.length; i++){
            for (int j = i + 1; j < A.length; j++){
                if (A[i] > A[j])
                {
                    tg = A[i];
                    A[i] = A[j];
                    A[j] = tg;
                }
            }
        }
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
}
