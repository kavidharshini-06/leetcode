class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        int index=word.indexOf(ch);
        if(index==-1){
            return word;
        }
        int i=0;
        int j=index;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String (arr);
        
    }
}