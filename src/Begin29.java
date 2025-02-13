import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,r;
        System.out.print("a=");
        a = scanner.nextDouble();

        if(0 < a && a < 360){
            r = a * (3.14 / 180);
            System.out.print("Radiana= " +  r);
        }else{
            System.out.print("a ni qiymati 0 katta 360 dan kichik bolishi kerak");
        }

    }
}
