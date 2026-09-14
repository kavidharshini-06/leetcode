class Solution {
    public int distributeCandies(int[] candyType) {
        java.util.Arrays.sort(candyType);

        int count = 1;

        for (int i = 1; i < candyType.length; i++) {
            if (candyType[i] != candyType[i - 1]) {
                count++;
            }
        }

        return Math.min(count, candyType.length / 2);
    }
}