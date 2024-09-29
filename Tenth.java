abstract class Car{
    
    public abstract void driving();

    public void playMusic(){
        System.out.println("Music is playing ...");
    }
}

class WagnoR extends Car {  // this is called a concrete class as it implements abstract class
    public void driving(){
        System.out.println("Car is driving ...");
    }
} 

public class Tenth {
    public static void main(String[] args) {
        WagnoR obj = new WagnoR();
        obj.playMusic();
        obj.driving();
    }
}
