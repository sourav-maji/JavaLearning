import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eighteen {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(2);
        nums.add(21);
        nums.add(15);

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);
    }
}
