package sortalgorithms;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(arr, 0, arr.length);

        for (int  i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end  - start];

        while (i < mid && j < end) {
            if (input[i] <= input[j]) {
                temp[tempIndex] = input[i];
                tempIndex++;
                i++;
            } else {
                temp[tempIndex] = input[j];
                tempIndex++;
                j++;
            }
        }

        for (int  k = 0; k < temp.length; k++) {
            System.out.print(temp[k] + " ");
        }

        System.out.println("");
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
        
    }
}
