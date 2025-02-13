import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a >= 0 || b < -2){
            System.out.print(true);
        }else {
            System.out.print(false);
        }

    }
}
