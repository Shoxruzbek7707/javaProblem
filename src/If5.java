import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int musbat = 0 ,manfiy = 0 ,a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if (a > 0){
            musbat++;
        }else{
            manfiy++;
        }

        if (b > 0){
            musbat++;
        }else{
            manfiy++;
        }

        if (c > 0){
            musbat++;
        }else{
            manfiy++;
        }

        System.out.println("Musbat " + musbat);
        System.out.println("Manfiy " + manfiy);
    }
}
