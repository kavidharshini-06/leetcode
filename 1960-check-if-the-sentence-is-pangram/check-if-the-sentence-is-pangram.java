class Solution {
    public boolean checkIfPangram(String sentence) {
     Set<Character>n=new HashSet<>();
     for(char num:sentence.toCharArray()){
        n.add(num);
     }   
     return n.size() == 26;
    }
}