import java.util.*;

public class smallest_positive_missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr, n));
    }

    static int missingNumber(int arr[], int size) {
        // Bruteforce --->O(nlogn)

        // int k=0;
        // boolean flag=false;
        // Arrays.sort(arr);
        // int start=1;
        // for(int i=0;i<arr.length;i++){
        // if(arr[i]<=0 || arr[i]==start-1)continue;
        // if(start==arr[i]){
        // start++;
        // }else{
        // return start;
        // }
        // }
        // return start;

        // Optimised--> O(n)
        HashSet<Integer> hh = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                hh.add(arr[i]);
        }
        int start = 1;
        while (true) {
            if (hh.contains(start)) {
                start++;
            } else {
                return start;
            }
        }
    }
}
