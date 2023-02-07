package Method;

import java.util.Scanner;

public class Account3 {
    int balance = 10000;

    int deposit(int money) {
        int x = 0;
        if (money <= 0) {
            x = -1;
        } else {
            x = balance + money;
        }
        return x;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        Account3 a = new Account3();
        if (a.deposit(money) == -1) {
            System.out.println("Error");
        } else {
            System.out.println(a.deposit(money));
        }

    }
}
