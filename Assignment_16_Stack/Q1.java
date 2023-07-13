import java.util.*;

class Solution {
    Stack<Pair> mystack = new Stack<>();
    HashMap<Integer, Integer> mymap = new HashMap<>();

    class Pair {
        int data;
        int freq;

        Pair(int data, int freq) {
            this.data = data;
            this.freq = freq;
        }
    }

    void nextGreaterElement(int[] arr, int[] res) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (mymap.containsKey(arr[i]))
                mymap.put(arr[i], mymap.get(arr[i]) + 1);
            else
                mymap.put(arr[i], 1);
        }

        int curr_freq = mymap.get(arr[n - 1]);
        mystack.push(new Pair(arr[n - 1], curr_freq));
        res[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            curr_freq = mymap.get(arr[i]);

            while (!mystack.isEmpty() && curr_freq >= mystack.peek().freq)
                mystack.pop();

            res[i] = (mystack.isEmpty()) ? -1 : mystack.peek().data;

            mystack.push(new Pair(arr[i], mymap.get(arr[i])));
        }
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 11, 3, 3};

        int res[] = new int[arr.length];
        obj.nextGreaterElement(arr, res);
        System.out.println(Arrays.toString(res));
    }
}
