import java.util.Arrays;

class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4, 8, 7, 10, 6, 9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
