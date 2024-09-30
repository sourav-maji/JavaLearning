import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sixteen {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(2);
        System.out.println(nums);

        for(int n: nums){
            System.out.println(n);
        }


        Set<Integer> num = new HashSet<Integer>(); 
        // hashset doesn't return duplicate value and it doesn't return elements in sorted order
        num.add(5);
        num.add(5);
        num.add(7);
        num.add(2);
        num.add(3);

        System.out.println(num);

        Set<Integer> num1 = new TreeSet<Integer>(); 
        // TreeSet doesn't return duplicate value and it returns the elements in sorted order
        num1.add(5);
        num1.add(5);
        num1.add(7);
        num1.add(2);
        num1.add(3);

        System.out.println(num1);
    }
}
