package Method;

public class car2 {
    int year = 2001;
    int km = 8000;

    int calculatePrice() {
        int age = 2021 - year;
        int vaule = 10000 - km;
        return 25000 + vaule - (age * 1000);
    }

    public static void main(String[] args) {
        car2 a = new car2();
        System.out.println(a.calculatePrice());
    }
}
