class SmallestElemtInArray {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 7, 1, 8};
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

