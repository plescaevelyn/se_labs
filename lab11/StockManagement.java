package lab11;

import java.util.ArrayList;
import java.util.List;

public class StockManagement {


    public class Product {
        String name;
        int quantity;
        float price;

        public Product(){}

        public Product(String name, int quantity, float price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }

    public class ProductStock {
        List<Product> productList = new ArrayList<>();

        public ProductStock() {
            this.productList = productList;
        }

        public void addNewProduct(){
            Product newProduct = new Product();

            //todo change this
            String name = "";
            float price = 0f;
            int qty = 0;

            newProduct.setName(name);
            newProduct.setPrice(price);
            newProduct.setQuantity(qty);
            productList.add(newProduct);
        }

        public void viewProducts(){
            for (Product product : productList) {
                System.out.println("\nName:\t" + product.getName() +
                        "\nPrice:\t" + product.getPrice() +
                        "\nQuantity:\t" + product.getQuantity());
            }
        }

        public void deleteProduct(Product toDelete){
            productList.removeIf(product -> (product.getName().equals(toDelete.getName())));
        }

        public void changeProductAvailableQuantity(Product product, int newQuantity){
            product.setQuantity(newQuantity);
        }
    }

}
