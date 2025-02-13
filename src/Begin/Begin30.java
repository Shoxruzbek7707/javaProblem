package Begin;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,g;

        System.out.print("a=");
        a = scanner.nextDouble();

        if (0 < a && a < 2 * 3.14){
            g = a * 180 / Math.PI;
            System.out.print("Gradus= " + g);
        }else{
            System.out.print("a ni qiyamti 0 dan katta 2*3.14 dan kichik bo'lishi kerak!");
        }
    }
}
