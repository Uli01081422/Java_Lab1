public class Pair {
    private  Product product;
    private int count;

    public Pair (final Product product, final int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public void setCount(final int count) {
        this.count = count;
    }
}
