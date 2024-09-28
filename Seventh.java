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

class VeryAdvCalculator extends AdvCalculator{
    public double power(int a,int b){
        return Math.pow(a, b);
    }
}


public class Seventh {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println(obj.add(5, 7));
        System.out.println(obj.subs(5, 7));

        AdvCalculator advObj = new AdvCalculator();
        System.out.println(advObj.mutli(4,6));
        System.out.println(advObj.division(14,6));
        System.out.println(advObj.add(4,6));

        VeryAdvCalculator veryAdvObj = new VeryAdvCalculator();
        System.out.println(veryAdvObj.add(7, 8));
        System.out.println(veryAdvObj.mutli(5, 4));
        System.out.println(veryAdvObj.power(5, 4));
        
    }
}


