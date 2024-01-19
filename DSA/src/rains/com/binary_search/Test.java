package rains.com.binary_search;

public class Test {
    public static void main(String[] args) {
        int left = 3, right = 10;
        System.out.println(left + (right - left) / 2); // finding median
        System.out.println((right + left) / 2); // finding median
        System.out.println((right - left) / 2); // finding delta
    }
}
