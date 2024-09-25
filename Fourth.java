import java.util.Scanner;

class Student{
    static Scanner sc = new Scanner(System.in);

    public int returnMarks(){
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        return marks;
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
        

    }
    
}
