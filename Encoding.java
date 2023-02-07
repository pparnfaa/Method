package Method;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for (int i = 0; i < text.length(); i++) {
            int pos = scan.nextInt();
            int new_char = (int) text.charAt(i) + pos;
            if (new_char >= (int) 'A' && new_char <= (int) 'Z') {
                System.out.print((char) new_char);
            } else {
                int new_char2 = (new_char - (int) 'Z') + (int) 'A' - 1;
                System.out.print((char) new_char2);
            }

        }
    }
}
