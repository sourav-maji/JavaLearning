abstract class Car{
    
    abstract public void driving();

    public void playMusic(){
        System.out.println("Music is playing ...");
    }
}

class WagnoR extends Car {
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
