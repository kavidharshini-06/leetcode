class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr=curr+arr[j];
                int length=j-i+1;
                if(length%2==1){
                    sum=sum+curr;
                }
            }
        }
        return sum;
        
    }
}