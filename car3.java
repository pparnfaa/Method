package Method;

import java.util.Scanner;

public class car3 {

    int calculatePrice(int year, int km) {
        int age = 2021 - year;
        int vaule = 10000 - km;
        return 25000 + vaule - (age * 1000);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        car3 a = new car3();
        int year = scan.nextInt();
        int km = scan.nextInt();
        System.out.println(a.calculatePrice(year, km));
    }
}
