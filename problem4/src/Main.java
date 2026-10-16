import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart(2);

        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Item name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Item item = new Item(name, price, quantity);
            cart.addToCart(item);

            cart.printCart();

            System.out.print("Continue shopping? (y/n): ");
            answer = sc.nextLine();
        }

        System.out.println("Please pay " + cart.getTotalPrice() + " MAD");

        sc.close();
    }
}