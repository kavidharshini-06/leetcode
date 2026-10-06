class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>n =new ArrayList<>();
        for(int i=0;i<words.length;i++){
        if(words[i].contains(String.valueOf(x))){
            n.add(i);
        }
        }
        return n;
        
    }
}