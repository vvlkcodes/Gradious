import java.util.*;

class Number_of_Inversions {

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 2, 6, 5};
        System.out.println("Original: " + Arrays.toString(arr));

        int inversions = mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted:   " + Arrays.toString(arr));
        System.out.println("Inversions: " + inversions);
    }

    public static int mergeSort(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int mid = l + (r - l) / 2;

            count += mergeSort(arr, l, mid);
            count += mergeSort(arr, mid + 1, r);
            count += merge(arr, l, mid, r);
        }
        return count;
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        int c = 0;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                c += (n1 - i); // inversion logic
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];

        return c;
    }
}