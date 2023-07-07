import java.util.*;

class Maximum_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxIndexDiff(arr, n));
    }

    static int maxIndexDiff(int arr[], int n) {
        // Time comp: O(n^2);

        // int diff=0;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n;j++){
        // if(arr[i]<=arr[j]){
        // diff=Math.max(j-i,diff);
        // }
        // }
        // }
        // return diff;

        // optimised O(n)
        int i = 0, j = n - 1;
        int maxi = 0;

        while (i < j) {

            if (arr[j] >= arr[i]) {
                maxi = Math.max(maxi, j - i);
                i++;
                j = n - 1;
            } else {
                j--;
            }
        }

        return maxi;
    }
}