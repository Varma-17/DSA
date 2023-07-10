class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        int i=0;
        Map<Integer,Integer> map=new TreeMap<>();
        int res[]=new int[n/2];
        if(n%2==1)
        {
            return new int[]{};
        }
        for(int k:changed)
        {
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int x:map.keySet())
        {
            if(map.get(x)>map.getOrDefault(x+x,0))
            {
                return new int[]{};
            }
            for(int j=0;j<map.get(x);j++)
            {
                res[i++]=x;
                map.put(x+x,map.get(x+x)-1);
            }
        }
        return res;
    }
}
