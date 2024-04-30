import java.util.ArrayList;
import java.util.List;

class Market {
    private List<Product> inventory;

    public Market() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public Product findProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void makePurchase(Client client) {
        for (Product product : client.cart) {
            Product productInInventory = findProduct(product.getName());
            if (productInInventory != null && productInInventory.getStockQuantity() > 0) {
                productInInventory.setStockQuantity(productInInventory.getStockQuantity() - 1);
            } else {
                System.out.println("Producto no disponible: " + product.getName());
            }
        }
        client.cart.clear();
    }

    public void showInventory() {
        System.out.println("Inventario del mercado:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}