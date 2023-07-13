class Solution {
    public int minProductSum(int[] nums1, int[] nums2) 
    {
        int ans = 0;
        Arrays.sort(nums1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1,i2)->i2-i1);
        for(int i : nums2){
            pq.add(i);
        }
        int i = 0;
   
        while(i < nums1.length && !pq.isEmpty()){
            ans += nums1[i] * pq.poll();
            i++;
        }
        return ans;
    }
}
