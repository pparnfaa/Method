package Method;

import java.util.Scanner;

public class ThreeNumber {

    static void calculate(int x, int x2, int x3, int type) {
        int min = 0;
        int max = 0;
        int mean = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        if (type == -1) {
            if (x < x2 && x < x3) {
                min = x;
            } else if (x2 < x && x2 < x3) {
                min = x2;
            } else if (x3 < x && x3 < x2) {
                min = x3;
            } else if (x == x2 && x == x3) {
                min = x;
            }
            System.out.println(min);
        }
        if (type == 1) {
            if (x > x2 && x > x3) {
                max = x;
            } else if (x2 > x && x2 > x3) {
                max = x2;
            } else if (x3 > x && x3 > x2) {
                max = x3;
            } else if (x == x2 && x == x3) {
                max = x;
            }
            System.out.println(max);
        }
        if (type == 0) {
            if (x != max && x != min) {
                mean = x;
            } else if (x2 != max && x2 != min) {
                mean = x2;
            } else if (x3 != max && x3 != min) {
                mean = x3;
            } else if (x == x2 && x == x3) {
                mean = x;
            }
            if (x < x2 && x < x3) {
                mean = x2;
            }
            System.out.println(mean);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        int type = scan.nextInt();
        calculate(x, x2, x3, type);
    }
}
