class Solution {
    public int largestAltitude(int[] gain) {
        int n=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
             n=n+gain[i];
             max=Math.max(n,max);
        }
        return max;
    }
}