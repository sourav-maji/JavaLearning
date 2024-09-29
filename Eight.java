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

public class Eight {
   public static void main(String[] args) {
        B obj = new B();
        obj.show();

        // final :- we if use final keyword then we can't change the value
        final int num =9;
        // num =10; // this will thow an error as we can't change value of final variable 
   } 
}
