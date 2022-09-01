public class Product {
    private String nameOfProduct;
    private int price;

    public Product(final String nameOfProduct, final int price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public void setNameOfProduct(final String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice() {
        return price;
    }
}