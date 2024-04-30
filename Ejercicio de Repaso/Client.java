import java.util.ArrayList;
import java.util.List;

class Client {
    private String firstName;
    private String lastName;
    List<Product> cart;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cart = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
        cart.add(product);
    }

    public double calculateTotalPurchase() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}