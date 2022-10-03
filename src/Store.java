import java.util.ArrayList;

public class Store {

    //******* attributes ************************************************************

    final private String name;
    final private String city;
    final private int Id;
    ArrayList<Product> products = new ArrayList<>();

    //******* constructor method  ***************************************************

    public Store(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.Id = id;
        this.products = new ArrayList<>();

    //******* add product method   **************************************************

    }
    public void addProduct(Product pr){
        this.products.add(pr);


    }
}