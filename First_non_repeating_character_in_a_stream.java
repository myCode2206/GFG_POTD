import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(FirstNonRepeating(A));
    }

    public static String FirstNonRepeating(String A) {
        int j = 0;
        StringBuilder ans = new StringBuilder();
        Deque<Character> q = new ArrayDeque<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        q.offer(A.charAt(j));
        hm.put(A.charAt(j), 1);
        char ch = A.charAt(j);
        while (j < A.length()) {
            while (q.isEmpty() == false && hm.get(q.peek()) > 1) {
                q.poll();
            }
            if (q.isEmpty() == false)
                ans.append(q.peek());
            else
                ans.append("#");
            j++;
            if (j < A.length()) {
                ch = A.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                if (hm.get(ch) == 1)
                    q.offer(ch);
            }
        }
        return ans.toString();
    }
}