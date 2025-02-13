package Case;

import  java.util.Scanner;
public class Case13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("1-Katet, 2-Gipotenuza, 3-Yuza. Qaysi element kiritiladi? ");
            int tanlov = scanner.nextInt();
            System.out.print("Qiymatni kiriting: ");
            double qiymat = scanner.nextDouble();
            double natija = 0;
            switch (tanlov) {
                case 1 -> natija = qiymat * Math.sqrt(2);
                case 2 -> natija = qiymat / Math.sqrt(2);
                case 3 -> natija = Math.pow(qiymat, 2) / 2;
                default -> System.out.println("Noto‘g‘ri tanlov!");

            }
            System.out.println("Natija: " + natija);

        }
}
