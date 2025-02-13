import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S,m,s;

        System.out.println("Sekund=");
        S = scanner.nextInt();

        if (S >= 60){
            m = S / 60;
            s = S % 60;
            System.out.println(m + " =Minut," + s + "=Sekund");
        }else {
            System.out.println("s >= 60 bo'lishi kerak! ");
        }
    }
}
