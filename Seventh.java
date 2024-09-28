class Calculator{
    public int add(int a,int b){
        return a+b;
    }

    public int subs(int a,int b){
        return a-b;
    }
}

class AdvCalculator extends Calculator{
    public int mutli(int a,int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }
}


public class Seventh {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println(obj.add(5, 7));
        System.out.println(obj.subs(5, 7));

        AdvCalculator advObj = new AdvCalculator();
        System.out.println(advObj.mutli(4,6));
        System.out.println(advObj.division(4,6));
        System.out.println(advObj.add(4,6));
        
    }
}


