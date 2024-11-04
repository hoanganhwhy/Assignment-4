package assignment4;

public class Timsonguyento {

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to tu 1 den 100 la: ");

        for (int n = 2; n <= 100; n++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n + "\n");
            }
        }

    }
}

