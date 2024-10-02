import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n 값을 입력하세요: ");
        int n = scanner.nextInt();

        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += i;


            if (n >= 100) {
                System.out.println("n이 100 이상입니다. 합은 " + sum + "입니다.");
                break;
            }
        }
        if (n < 100) {
            System.out.println("n이 100 미만입니다. 합은 " + sum + "입니다.");
        }

        scanner.close();
    }
}