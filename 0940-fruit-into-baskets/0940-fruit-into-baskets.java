class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> typeToCnt = new HashMap<>();
        int st=0, result=0;
        for (int end=0;end<fruits.length;end++) {
            int fType = fruits[end];
            typeToCnt.put(fType, typeToCnt.getOrDefault(fType, 0) + 1);
            while(typeToCnt.keySet().size() > 2) {
                int curCnt = typeToCnt.get(fruits[st]);
                typeToCnt.put(fruits[st], curCnt-1);
                typeToCnt.remove(fruits[st++], 0);
            }
            result = Math.max(result, end-st+1);
        }
        return result;
    }
}