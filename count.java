public class count {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 7, 6, 10, 9, 4, 1, 8 };
        int i = 0;
        while (i < arr.length) {
            int count = arr[i] - 1;
            if (arr[i] != arr[count]) {
                swap(arr, i, count);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
