int climbStairs(int n) {
    if(n==1){
        return n;
    }
    int s1=1,s2=1,i,ans=0;
    for(i=1;i<n;i++){
        ans=s1+s2;
        s1=s2;
        s2=ans;
    }
    return ans;
}

/*
java

class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int x=1,y=1,ans=x+y;
        for(int i=0;i<n-1;i++){
            ans=x+y;
            x=y;
            y=ans;
        }
        return ans;
}
}
*/
