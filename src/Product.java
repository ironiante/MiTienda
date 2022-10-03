public class Product {
    private String name;
    private String descriptions;
    private String category;
    private  String label;
    private double price;
    private Label labels;

    public Product(String name, String descriptions, String category, String label, double price,Label labels) {
        this.name = name;
        this.descriptions = descriptions;
        this.category = category;
        this.label = label;
        this.price = price;
        this.labels =labels;
    }

    public Label getLabels() {
        return labels;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", category='" + category + '\'' +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", labels=" + labels +
                '}';
    }
}
