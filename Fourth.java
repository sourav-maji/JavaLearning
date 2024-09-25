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

        int nums[] ={2,6,3,7};
        nums[1]=4;
        System.out.println(nums[1]);

        int num2[] = new int[4]; // this will return an array of size 4 with values 0
        System.out.println(num2[1]); 


        // jagged array : in this type of array , the numbers of columns in each rows are not same

        int num3[][] = new int[3][];
        num3[0] = new int[3];
        num3[1] = new int[4];
        num3[2] = new int[2];

        for(int i=0; i<num3.length;i++){
            for(int j=0; j< num3[i].length;j++){
                num3[i][j] =(int) (Math.random()*10);
            }
        }
        System.out.println("Jagged Array : ");

        for(int m[]: num3){
            for(int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
    
}
