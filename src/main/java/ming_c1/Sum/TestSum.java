package ming_c1.Sum;

import java.util.ArrayList;

public class TestSum {
    public static void main(String[] args) {
        int count = 100;
        ArrayList<Integer> arr = new ArrayList<>();
        do {
            arr.add(count);
        } while (count-- > 0);


        Sum sum = new Sum();
        int begin = arr.get(0);
        int end = arr.get(arr.size() - 1);
        System.out.format("The first number is:  %d\n", begin);
        System.out.format("The end number is:  %d\n", end);
        System.out.format("The sum of all number add together is:  %d\n", sum.acquireSum(arr));

    }
}
