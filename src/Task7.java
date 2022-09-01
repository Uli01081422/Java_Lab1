import java.util.List;

public class Task7 {
    public static Pair []array = new Pair[]
                {
                        new Pair(new Product("Kivi", 2),3),
                        new Pair(new Product("Ananas", 2),3)

                };
        public static void main ( final String[] args) {
            Product productArray;
            double  sum = 0;

            for ( int i = 0; i < array.length; i++ ) {
                productArray =  array[i].getProduct();
                System.out.println(productArray.getNameOfProduct() + productArray.getPrice() + array[i].getCount());

                sum +=  productArray.getPrice();


            }
            System.out.println(sum);


        }
    }


