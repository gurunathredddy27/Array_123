class LargestElemtInArray {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 7, 1, 8};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
