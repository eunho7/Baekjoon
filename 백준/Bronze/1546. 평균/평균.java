import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            int input = sc.nextInt();
            if (max <= input) max = input;

            sum += input;
        }

        double avg = (double) sum / num / max * 100;

        System.out.println(avg);
    }
}