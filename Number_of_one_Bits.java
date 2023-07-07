import java.util.*;

class Number_of_one_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(setBits(n));
    }

    static int setBits(int n) {
        int count = 0;
        while (n != 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
}