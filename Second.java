public class Second {
    public static void main(String args[]){
        int res =5;
        int ans = res%2 == 0 ? res : res*2;
        System.out.println("Answer is "+ ans);
        int day =4;

        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Enter valid day");

        }
    }
    
}
