package id.akdev.arrays;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {1, 341,313,12314,3252,1231,352,213,14,13,352,3,123,53};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 123));
        System.out.println(Arrays.binarySearch(numbers, 1231221));

        int limaNumberTerkecil[] = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(limaNumberTerkecil));

    }
}
