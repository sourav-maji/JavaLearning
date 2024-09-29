class Laptop {
    String model;
    int price;

    public String toString(){
        return "model" + " : " +price;
    }

    public boolean equal(Laptop that){
        if((this.model == that.model) && (this.price == that.price)){
            return true;
        }else{
            return false;
        }
    }

}

public class Nineth {
    
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "MacBook";
        obj1.price =3500;

        System.out.println(obj1); // Laptop@6b95977
        System.out.println(obj1.toString()); // Laptop@6b95977   
        // the obj call by default calling the toString() method

        Laptop obj2 = new Laptop();
        obj2.model = "MacBook";
        obj2.price =3500;
        boolean result = obj1.equal(obj2);
        System.out.println(result);
    }
}
