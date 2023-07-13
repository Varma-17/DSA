import java.util.Stack;

public class Solution {
    static Stack<Integer> st = new Stack<>();

    static void pushDigits(int number) {
        while (number != 0) {
            st.push(number % 10);
            number = number / 10;
        }
    }

    static int reverseNumber(int number) {
        pushDigits(number);
        int reverse = 0;
        int i = 1;

        while (!st.isEmpty()) {
            reverse = reverse + (st.peek() * i);
            st.pop();
            i = i * 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int number = 39997;
        System.out.println(reverseNumber(number));
    }
}
