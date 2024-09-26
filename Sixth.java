class Mobile{
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand + " : "+ price +" : "+name);
    }
}
public class Sixth {

    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price =1500;
        obj1.name  ="SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price =1300;
        obj2.name  ="SmartPhone";

        obj1.show();
        obj2.show();


        // with the help of static keyword we make a variable to be the part of class member not the object member
        // static variable value is shared by all the objects of that class
    }
    
}
