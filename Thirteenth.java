enum Status{
    Running, Failed ,Pending , Success;
}

public class Thirteenth {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] s1 = Status.values();
        for( Status i : s1){
            System.out.println(i+ " " + i.ordinal());
        }

        // If-else statement
        if(s == Status.Running){
            System.out.println("All Good");
        }else if (s == Status.Failed){
            System.out.println("Please try again");
        }else if (s == Status.Pending){
            System.out.println("Please Wait");
        }else{
            System.out.println("Done !!");
        }
    }
}
