package assignment4;

public class Tongcacsochanle {
    public static void main(String[] args) {
        int tongchan = 0;
        int tongle = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                tongchan += i;
            } else {
                tongle += i;
            }
        }
        System.out.println("Tong tat ca cac so chan tu 1 den 100 la: " + tongchan);
        System.out.println("Tong tat ca cac so le tu 1 den 100 la: " + tongle);
    }
}
