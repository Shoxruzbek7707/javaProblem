package integers;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s,m;

        System.out.println("Sekund=");
        s = scanner.nextInt();

        if (s >= 60){
            m = s / 60;
            System.out.println("Minut=" + m);
        }else {
            System.out.println("s >= 60 bo'lishi kerak! ");
        }
    }
}
