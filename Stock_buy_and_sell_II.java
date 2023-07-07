import java.util.*;

public class Stock_buy_and_sell_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(stockBuyAndSell(n, arr));
    }

    public static int stockBuyAndSell(int n, int[] A) {
        int profit = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1])
                profit += (A[i] - A[i - 1]);
        }
        return profit;
    }
}
