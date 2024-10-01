import java.io.File;
import java.util.*;

class Student1 {
    int roll, marks;
    String name;

    public Student1() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SortByMarks implements Comparator<Student1> {
    public int compare(Student1 o1, Student1 o2) {
        return o2.getMarks() - o1.getMarks();
    }
}

class SortByName implements Comparator<Student1> {
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByRoll implements Comparator<Student1>{

    public int compare(Student1 o1, Student1 o2) {
        if(o2.getRoll() > o1.getRoll()){
            return 1;
        }else{
            return -1;
        }

    //    return o2.getRoll() - o1.getRoll();
    }
    
}



public class prg1 {
    public static void main(String[] args) throws Exception {
        File f = new File(".//data.txt");
        Scanner sc = new Scanner(f);
        String s;
        ArrayList<Student1> students = new ArrayList<Student1>();
        while (sc.hasNext()) {
            s = sc.nextLine();
            // System.out.println(s);
            String[] newS = s.split("\\ ");
            // System.out.println(newS[0] + " : "+ newS[1] + " : " + newS[2]);
            Student1 st = new Student1();
            st.setRoll(Integer.parseInt(newS[0]));
            st.setName(newS[1]);
            st.setMarks(Integer.parseInt(newS[2]));

            // System.out.println(st.getRoll() + " -> "+ st.getName() + " -> " +
            // st.getMarks());
            students.add(st);

        }
        // for(Student1 st : students){
        // System.out.println(st.getRoll() + " -> " + st.getName() + " -> " +
        // st.getMarks() );
        // }

        int userInput = 19;
        boolean isFound = false;

        for (Student1 st : students) {
            if (st.getRoll() == userInput) {
                isFound = true;
                System.out.println(st.getRoll() + " -> " + st.getName() + " -> " + st.getMarks());
                break;
            }
        }
        if (!isFound) {
            System.out.println("User not found...");
        }

        SortByMarks sbm = new SortByMarks();
        Collections.sort(students, sbm);
        System.out.println("**** Sort By Marks ******");
        for (Student1 st : students) {
            System.out.println(st.getRoll() + " -> " + st.getName() + " -> " + st.getMarks());
        }

        SortByName sbn = new SortByName();
        Collections.sort(students, sbn);

        System.out.println("**** Sort By Name ******");
        for (Student1 st : students) {
            System.out.println(st.getRoll() + " -> " + st.getName() + " -> " + st.getMarks());
        }

        SortByRoll sbr = new SortByRoll();
        Collections.sort(students,sbr);

        System.out.println("**** Sort By Roll No ******");
        for (Student1 st : students) {
            System.out.println(st.getRoll() + " -> " + st.getName() + " -> " + st.getMarks());
        }

        sc.close();

    }
}
