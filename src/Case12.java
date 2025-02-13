import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Radiusni kiriting: ");
        double radius = skaner.nextDouble();

        double diametr = 2 * radius;
        double uzunlik = Math.PI * diametr;
        double yuza = Math.PI * radius * radius;

        System.out.println("Diametr: " + diametr);
        System.out.println("Uzunlik: " + uzunlik);
        System.out.println("Yuzasi: " + yuza);
    }
}


