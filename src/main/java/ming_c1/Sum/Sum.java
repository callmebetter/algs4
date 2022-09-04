package ming_c1.Sum;

import java.util.ArrayList;

public class Sum {
    private int sum;

    public int acquireSum(ArrayList<Integer> numbers) {
        if (numbers == null) {
            System.out.println("The array is empty");
            return sum;
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return sum;
    }

}
