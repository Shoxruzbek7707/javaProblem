import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();
        int S = n*n;
        if (n>0){
            for (int i = 1;i <= n;i++){
               if (i%2==1){
                   S +=  i;
               }
            }
            System.out.println(S);
        }else {
            System.out.println("n > 0 bo'lishi kerak! ");
        }
    }
}
