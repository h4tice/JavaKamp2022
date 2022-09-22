public class Main {
    public static void main(String[] args) {
        // attribute | field
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Siyah");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
        System.out.println(product.getDescription());

    }
}
