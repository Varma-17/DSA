class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack=new Stack<>();
        int n=height.length;

        int ans=0;

        for(int i=0;i<n;i++)
        {
            while((!stack.isEmpty()) && 
            (height[stack.peek()]<height[i]))
            {
                int pop=height[stack.peek()];
                stack.pop();

                if(stack.isEmpty())
                {
                    break;
                }

                int dist=i-stack.peek()-1;

                int min=Math.min(height[stack.peek()]
                ,height[i])-pop;

                ans+=dist*min;
            }
            stack.push(i);
        }

        return ans;
    }
}
