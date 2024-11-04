package assignment4;
import java.util.Scanner;

public class Tongcacchuso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int tong = 0;
        while(n > 0) {
            int so = n % 10;
            tong += so;
            n /= 10;
        } 
        System.out.println("Tong cua tat ca chu so la: " + tong);
    }
}
