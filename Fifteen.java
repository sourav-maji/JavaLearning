class A1 extends Thread {
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(100); 
                // we are explicitly waiting the tread for 100 ms
            } catch (Exception e) {
               System.out.println(e);
            } 
        }
    }
}

class B1 extends Thread {
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hello");
        }
    }
}

public class Fifteen {
    public static void main(String[] args) {

        A1 obj1 = new A1();
        B1 obj2 = new B1();

        obj1.start();
        obj2.start();

        // we can set the priority of the the tread .. 10 means max priority , 1 is low priority , 5 is normal priority

        obj2.setPriority(Thread.MAX_PRIORITY);
        
    }
}
