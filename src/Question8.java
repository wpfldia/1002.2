public class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i += 2;
        }

        System.out.println("1부터 100까지의 홀수의 합: " + sum);
    }
}
