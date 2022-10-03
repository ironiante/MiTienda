public class Main {
    public static void main(String[] args) {

       Store pp = new Store("aaa","bogota",123);
       pp.addProduct(new Product("leche entera alpina ","bolsa*1000 ml","lacteos","leches",3100,Label.Leches));
        for (Product pr: pp.products ) {
            System.out.println(pr);

        }
    }
}
