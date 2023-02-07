package Method;

import java.util.Scanner;

class Employee {
    String name, ID;
    int type, wage;
    int exWork = 0;
    int opWork = 0;
    int payment = 0;

    Employee(String name, String ID, int type, int wage) {
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.wage = wage;
    }

    boolean workExecutive(int hour) {
        boolean x = false;
        if (hour > 0) {
            exWork += hour;
            x = true;
        } else {
            System.out.println("Invalid hour for executive work");
            x = false;
        }
        return x;
    }

    boolean workOperation(int hour) {
        boolean x = false;
        if (hour > 0) {
            opWork += hour;
            x = true;
        } else {
            System.out.println("Invalid hour for operation work");
            x = false;
        }
        return x;
    }

    int calPayment() {
        if (type == 1) {
            payment = (exWork * wage) + (opWork * ((2) * (wage)));
            return payment;
        } else {
            payment = (exWork * ((2) * wage)) + (opWork * wage);
            return payment;
        }
    }

    void printStats() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        if (type == 1) {
            System.out.println("Position: Executive");
        } else if (type == 2) {
            System.out.println("Position: Operation");
        }
        System.out.println("Ex Hour: " + exWork);
        System.out.println("Op Hour: " + opWork);
        System.out.println("Wage: " + wage);
        System.out.println("Payment: " + payment);
    }

}

public class HR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String ID = scan.next();
        int type = scan.nextInt();
        int wage = scan.nextInt();
        Employee employ = new Employee(name, ID, type, wage);

        final int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int workType = scan.nextInt();
            int hour = scan.nextInt();
            if (workType == 1) {
                System.out.print(employ.workExecutive(hour) + " ");
            } else if (workType == 2) {
                System.out.print(employ.workOperation(hour) + " ");
            }
            System.out.println(employ.calPayment());
        }
        employ.printStats();
    }
}
