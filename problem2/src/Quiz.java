import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many questions are in the quiz? ");
        int n = sc.nextInt();

        int[] key = new int[n];

        System.out.println("Enter the correct answers:");
        for (int j = 0; j < n; j++) {
            key[j] = sc.nextInt();
        }

        char choice;

        do {
            int correct = 0;

            System.out.println("Enter the student's answers:");
            for (int i = 0; i < n; i++) {
                int answer = sc.nextInt();

                if (answer == key[i]) {
                    correct++;
                }
            }

            double percentage = (double) correct / n * 100;

            System.out.println("Number correct: " + correct);
            System.out.println("Percent correct: " + percentage + "%");

            System.out.print("Grade another quiz? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}