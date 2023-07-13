import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        Queue<Character> queue = new LinkedList<>();

        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
            queue.offer(c);
        }

        // Find the first non-repeating character by checking the count
        while (!queue.isEmpty()) {
            char c = queue.poll();
            if (count[c - 'a'] == 1) {
                return s.indexOf(c);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First non-repeating character index in \"" + s1 + "\": " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First non-repeating character index in \"" + s2 + "\": " + firstUniqChar(s2));
    }
}
