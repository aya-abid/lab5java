import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");

        int n = sc.nextInt();
        System.out.println("Enter " + n + " values");

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The array initially : " + Arrays.toString(numbers));

        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        System.out.println("reversed array : " + Arrays.toString(numbers));

        sc.close();
    }
}