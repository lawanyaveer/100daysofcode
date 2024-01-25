class Solution{
    int mxp;
    int[] prime; 
    Solution(){
        mxp=9999;
        prime=new int[10001];
        Arrays.fill(prime,1);
        prime[1]=0;
        for(int i=2;i<=mxp;i++){
            if(prime[i]==1){
                for(int j=2;j*i<=mxp;j++){
                    prime[j*i]=0;
                }
            }
        }
    }
    int bfs(int source,int destination){
        int[] dp =new int[10001];
        Arrays.fill(dp,-1);
        int[] vis=new int[10001];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        dp[source]=0;
        vis[source]=0;
        while(q.size()>0){
            int current=q.poll();
            if(vis[current]==1)
                continue;
            vis[current]=1;
            String s=Integer.toString(current);
            for(int i=0;i<4;i++){
                for(char ch='0';ch<='9';ch++){
                    if(ch==s.charAt(i)||(ch=='0'&&i==0))
                        continue;
                    String nxt=s;
                    nxt=s.substring(0,i)+ch+s.substring(i+1);
                    int nxtN=Integer.valueOf(nxt);
                    if(prime[nxtN]==1&&dp[nxtN]==-1){
                        dp[nxtN]=1+dp[current];
                        q.add(nxtN);
                    }
                }
            }
        }
        return dp[destination];
    }
    int solve(int Num1,int Num2){
        return bfs(Num1,Num2);
    }
}
