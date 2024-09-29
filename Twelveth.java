interface Ab {

    // int age =44; // variable inside interface is final and static in nature
    void show();
    void config();
}

class B implements Ab {
    public void show(){
        System.out.println("In show B");
    }

    public void config(){
        System.out.println("In config B");
    }
}

public class Twelveth {
    public static void main(String[] args) {
        Ab obj;
        obj = new B();
        obj.show();
        obj.config();

        // System.out.println(A.age);
    }
}
