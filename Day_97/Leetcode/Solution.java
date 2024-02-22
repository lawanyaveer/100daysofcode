class Solution {
    static class Pair{
        String str;
        int dist;
        public Pair(String str, int dist){
            this.str=str;
            this.dist=dist;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set= new HashSet<>();
        for(String str: wordList){
            set.add(str);
        }
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair top= q.poll();
            String curr= top.str;
            int currPath= top.dist;
            if(curr.equals(endWord)){
                return currPath;
            }

            for(int i=0;i<curr.length();i++){
                for(char ch='a' ; ch <='z' ;ch++){
                    char replacedWord[]= curr.toCharArray();
                    replacedWord[i]=ch;
                    
                    String newString= new String(replacedWord);
                    if(set.contains(newString)){
                        set.remove(newString);
                        q.add(new Pair(newString, currPath+1));
                    }
                }
            }
        }
        return 0;
    }
}
