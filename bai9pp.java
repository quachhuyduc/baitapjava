import java.util.Scanner;
public class bai9pp {
    public static void main (String []args){
        String A;
        int count = 0;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("Nhap chuoi bat ky: ");
            A = sc.nextLine();
        
        }while (A.length() > 100 );
        for (int i = 0; i < A.length(); i++){
            if ((A.charAt(i) >= 'a' && A.charAt(i) <= 'z') || (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z')){
                count = count+1;
            }
        }
        System.out.println("co " + count + " chu hoa va chu thuong ");
    }

}