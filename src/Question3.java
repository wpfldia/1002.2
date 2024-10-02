import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("1 이상의 숫자를 입력하세요: ");
            n = scanner.nextInt();
        } while (n < 1);

        System.out.println("입력한 값: " + n);
        scanner.close();
    }
}
