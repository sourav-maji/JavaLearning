class Laptop {
    String model;
    int price;

    public String toString(){
        return "model" + " : " +price;
    }

}

public class Nineth {
    
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "MacBook";
        obj.price =3500;

        System.out.println(obj); // Laptop@6b95977
        System.out.println(obj.toString()); // Laptop@6b95977   
        // the obj call by default calling the toString() method
    }
}
