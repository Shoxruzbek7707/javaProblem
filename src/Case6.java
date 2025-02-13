import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uznlikBirlik,uzunlik;

        System.out.print("Uzunlik birligini tanlang:");
        uznlikBirlik = scanner.nextInt();

        System.out.print("Uzunlikni kiriting:");
        uzunlik = scanner.nextInt();

        int result=0;

        switch (uznlikBirlik){
            case 1: result = uzunlik / 10;break;
            case 2: result = uzunlik * 1000;break;
            case 3: result = uzunlik;break;
            case 4: result = uzunlik / 1000;break;
            case 5: result = uzunlik / 100;break;
            default: System.out.println("No'tg'ri birlik tanlandi!");break;
        }

        System.out.println(result);
    }
}
