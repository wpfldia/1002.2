import java.util.Scanner;
public class Question6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 숫자 입력: ");
            int a = sc.nextInt();

            System.out.print("두 번째 숫자 입력: ");
            int b = sc.nextInt();

            while (b != 0) {
                int num = b;
                b = a % b;
                a = num;
            }
            System.out.println("최대공약수: " + a);
        }
    }

