import java.util.*;

class Subarrays_having_product_less_than_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextLong();
        System.out.println(countSubArrayProductLessThanK(arr, n, k));
    }

    public static int countSubArrayProductLessThanK(long nums[], int n, long k) {
        if (k <= 1)
            return 0;

        int ans = 0;
        long prod = nums[0];
        if (prod < k)
            ans++;
        int left = 0;
        int right = 1;
        while (right != nums.length) {
            long val = nums[right];
            prod = prod * val;

            if (prod < k) {
                ans += right - left + 1;
            } else {
                while (prod >= k) {
                    prod = prod / nums[left];
                    left++;
                }
                ans += right - left + 1;
            }
            right++;
        }
        return ans;
    }
}