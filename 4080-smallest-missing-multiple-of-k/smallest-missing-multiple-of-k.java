class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> n =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            n.add(nums[i]);
        }
        int i=k;
        while(n.contains(i)){
            i=i+k;
        }
        return i;
    }
}


        
