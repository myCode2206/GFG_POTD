import java.util.*;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(n, arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void transpose(int n, int a[][]) {
        for (int row = 0; row < a.length; row++) {
            for (int col = row + 1; col < a.length; col++) {
                int temp = a[row][col];
                a[row][col] = a[col][row];
                a[col][row] = temp;
            }
        }
    }
}
