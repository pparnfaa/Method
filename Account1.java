package Method;

import java.util.Scanner;

public class Account1 {
    int balance = 10000;

    int deposit(int money) {
        return balance + money;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        Account1 a = new Account1();
        System.out.println(a.deposit(money));
    }
}
