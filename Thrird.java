import java.util.Scanner;
public class Thrird {

    public static void main( String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        int marks = returnMarks();
        double age = returnAge();
        System.out.println("Name is : "+name);
        System.out.println("Marks is : "+ marks);
        System.out.println("Age is : "+ age);
        sc.close();
        
    }

    public static int returnMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        return marks;
        
    }

    public static double returnAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        double age = sc.nextDouble();
        return age;
    }

    
}
