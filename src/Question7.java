import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();
        int k = 1;

        for (int i = 1; i <= n; i++) {
            k *= i;
        }

        System.out.println(n + "! = " + k);
    }
}
