public class GstMain {

    public static void main(String[] args) {

        ProductBasket productBasket = new ProductBasket();

        Product product = new Product("Rice", 5);
        productBasket.addProductToBasket("Rice",5);


        Product product1 = new Product("Sofa", 1);
        productBasket.addProductToBasket("Sofa",1);

        Product product2 = new Product("Laptop", 2);
        productBasket.addProductToBasket("Laptop",2);

        productBasket.getBillDetails();


    }
}
