class Solution {
    public boolean judgeCircle(String moves) {
        int count=0;
        int  count1=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                count++;
            }
            if(ch=='D'){
                count--;
            }
            if(ch=='R'){
                count1++;
            }
            if(ch=='L'){
                count1--;
            }}
            if(count==0 &&count1==0){
                return true;
            }
        
        return false;
    }
}