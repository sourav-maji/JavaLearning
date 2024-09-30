enum Laptop{
    MacBook(2000),XPS(2200),Surface(1500), ThinkPad(1800);

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) {
        this.price = price;
    }
    
}

public class Thirteen {
    public static void main(String[] args) {

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
        
    }
}
