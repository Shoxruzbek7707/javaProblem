import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R1,R2,S1,S2,S3;
        System.out.print("R1=");
        R1 = scanner.nextDouble();
        System.out.print("R2=");
        R2 = scanner.nextDouble();

        if(R1 < R2){
            System.out.print("R1 > R2 bo'lishi kerak!");
        }else  {
            S1 = Math.PI * R1;
            S2 = Math.PI * R2;
            S3 = Math.PI * (R1 - R2);

            System.out.println("R1 yuzasi: " + S1);
            System.out.print("R2 yuzasi: " + S2);
            System.out.println("R1 - R2 = " + S3);
        }




    }
}
