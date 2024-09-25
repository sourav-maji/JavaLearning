import java.util.Scanner;

class Student{
    static Scanner sc = new Scanner(System.in);

    public int returnMarks(){
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        return marks;
    }
    
}

// method overloading

class Calculate{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add(int n1, double n2){
        return n1+n2;
    }
}

public class Fourth {
   static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the Name : ");
        String name = sc.nextLine();

        Student st = new Student();

        int marks1= st.returnMarks();

        System.out.println(name.toUpperCase() + " has obtained "+ marks1 + " in the exam");
        
        Calculate cal = new Calculate();
        System.out.println(cal.add(6, 10));
        System.out.println(cal.add(6, 10,15));
        System.out.println(cal.add(6, 10.5));

    }
    
}
