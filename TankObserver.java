package Method;

import java.util.Scanner;

class WaterTank {
    int capacity = 0;
    int volume = 0;
    int width, length, height;

    WaterTank(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        capacity = width * length * height;
    }

    int fill(int amount) {
        volume += amount;
        if (volume > capacity) {
            System.out.println("Cannot fill the tank");
            volume = volume - amount;
            return -1;
        } else {
            return volume;
        }

    }

}

public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width, length, height);
        for (int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            System.out.println(tank.fill(amount));
        }

    }
}
