class Solution {
    public int scoreOfString(String s) {
    int sum=0;
    for(int i=0;i<s.length()-1;i++){
        sum=sum+Math.abs(s.charAt(i)-s.charAt(i+1));
    }
    return sum;
    }
}

/*
int scoreOfString(char* s) {
    int sum=0;
    for(int i=0;i<strlen(s)-1;i++){
        sum=sum+abs(s[i]-s[i+1]);
    }
    return sum;
}
*/
