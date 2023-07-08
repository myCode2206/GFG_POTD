import java.util.Arrays;
import java.util.Scanner;

class Merge_Without_Extra_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long arr1[] = new long[n];
        long arr2[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextLong();
        }
        merge(arr1, arr2, n, m);
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        // code here
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}