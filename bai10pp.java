import java.util.Scanner;
public class bai10pp {
    public static void main(String []args){
String chuoi;
char kitu;
int count = 0;
Scanner sc = new Scanner (System.in);
do {
    System.out.println("Nhap chuoi bat ki: ");
    chuoi = sc.nextLine();
}while (chuoi.length() > 80);
System.out.println("Nhap mot ki tu bat ki: ");
kitu = sc.next().charAt(0);
for (int i = 0; i < chuoi.length(); i++){
    if (kitu == (chuoi.charAt(i))) {
        count = count+1;
    }
}
System.out.println("co " + count + " trong chuoi ");
    }
}
