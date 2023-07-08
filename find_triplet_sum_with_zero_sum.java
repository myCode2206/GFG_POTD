import java.util.*;

class find_triplet_sum_with_zero_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findTriplets(arr, n));
        sc.close();
    }

    public static boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int search = -1 * arr[i];
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
                if (arr[low] + arr[high] == search) {
                    return true;
                } else if (arr[low] + arr[high] > search) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return false;
    }
}