class ReverseOrder {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array in reverse order and print elements
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}