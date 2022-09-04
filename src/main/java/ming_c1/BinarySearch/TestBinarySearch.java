package ming_c1.BinarySearch;

import algs4.In;
import algs4.StdIn;
import algs4.StdOut;

import java.util.Arrays;

public class TestBinarySearch {
    private static final String url = "../../../resources/tinyW.txt";
    public static void main(String[] args) {
        int[] whitelist = new In(url).readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}
