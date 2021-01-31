import java.util.Scanner;
public class bai12pp {
    public static void main(String []args){
        int n,m;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("nhap so dong: ");
            n = sc.nextInt();
        }while (n < 1);
        do {
            System.out.println("Nhap so cot: ");
            m = sc.nextInt();
        }while (m < 1);
        float A[][] = new float [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
            System.out.println("A[" + ( i+1 ) +"][" + ( j+1 ) + "]:" );
            A[i][j] = sc.nextFloat();
            
        }
    }
    System.out.println ("ma tran vua nhap la ");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            System.out.println(A[i][j]);
        }
    }
        float max = A[0][0];
        for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("So lon nhat la :" + max);
    }

    }

