class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A {
    public void show(){
        System.out.println("in A show");
    }
}

// class C extends A {
//     public void show(){
//         System.out.println("in A show");
//     }
// }

final class Calc{
    final public void show(){
        System.out.println("In Calc show");

        // we use final keyword in method to prevent the method over-riding 
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{
    // this will give an error as we can't extend the final class.
    // we use final keyword for class to stop the inheritance of the class
// }

public class Eight {
   public static void main(String[] args) {
        B obj = new B();
        obj.show();

        // final :- we if use final keyword then we can't change the value
        final int num =9;
        System.out.println(num);
        // num =10; // this will thow an error as we can't change value of final variable 

        Calc obj1 =new Calc();
        obj1.show();
        obj1.add(3,7);
   } 
}
