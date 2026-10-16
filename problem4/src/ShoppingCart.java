public class ShoppingCart {
    private Item[] cart;
    private int itemCount;
    private double totalPrice;

    public ShoppingCart(int capacity) {
        cart = new Item[capacity];
        itemCount = 0;
        totalPrice = 0;
    }

    public void increaseSize() {
        int newSize = cart.length + cart.length / 2;
        if (newSize <= cart.length) {
            newSize = cart.length + 1;
        }
        Item[] newCart = new Item[newSize];

        for (int i = 0; i < itemCount; i++) {
            newCart[i] = cart[i];
        }
        cart = newCart;
    }
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void printCart() {
        System.out.println("Shopping cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cart[i]);
        }
        System.out.println("Total: " + totalPrice + " MAD");
    }
}