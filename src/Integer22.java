import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N,m,s;

        System.out.println("Sekund=");
        N = scanner.nextInt();

        if (N >= 3600){
            m = N / 3600;
            s = (N - m) / 60;
            System.out.println(m + " =Minut," + s + "=Sekund");
        }else {
            System.out.println("s >= 60 bo'lishi kerak! ");
        }
    }
}
