import java.util.ArrayList;
import java.util.Collection;

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
    }
}
