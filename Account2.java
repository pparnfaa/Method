package Method;

import java.util.Scanner;

public class Account2 {
    int balance = 10000;

    void deposit(int money) {
        System.out.println(balance + money);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        Account2 a = new Account2();
        a.deposit(money);
    }
}
