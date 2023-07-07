import java.util.*;

public class Copy_Set_Bits_in_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(setSetBit(x, y, l, r));
    }

    static int setSetBit(int x, int y, int l, int r) {
        int mask = 0;
        // running a loop in range (l, r) to find set bits of y
        for (int i = l; i <= r; i++) {
            mask = mask | y & (1 << (i - 1));
        }
        // making same order bit set by taking OR
        return x | mask;
    }
}
