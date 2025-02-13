import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range, min: ");
        int min = scanner.nextInt();

        System.out.print("Enter range, max: ");
        int max = scanner.nextInt();

        int random = (int)((max - min) * Math.random() + min);

        int trycount = 3;

        while (true){
            System.out.print("Guess number=");
            int guessNumber = scanner.nextInt();

            if (guessNumber == random){
                System.out.println("You win :)");
                break;
            }else{
                trycount--;
                if(trycount > 0) {
                    if(guessNumber > random){
                        System.out.println("Kichiroq son kiriting:");
                    }else{
                        System.out.println("Kattaroq son kiriting:");
                    }
                    System.out.println(trycount + " ta urunish qoldi!");
                }else{
                    System.out.println("You looser :( random son -> " + random + " edi!");
                    break;
                }
            }

        }


    }
}
