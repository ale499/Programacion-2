public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.addProduct(new Product("Manzana", 1.99, 50));
        market.addProduct(new Product("Plátano", 0.99, 100));
        market.addProduct(new Product("Leche", 2.49, 30));

        market.showInventory();

        Client client = new Client("Juan", "Pérez");

        client.addProductToCart(new Product("Manzana", 1.99, 1));
        client.addProductToCart(new Product("Plátano", 0.99, 2));

        double total = client.calculateTotalPurchase();
        System.out.println("Total de la compra: $" + total);

        market.makePurchase(client);

        market.showInventory();
    }
}