bool isBalanced(char* num) {
    int len=strlen(num);
    int even=0,odd=0,i=0;
    while(i<len){
        even=even+(num[i]-'0');
        i+=2;
    }
    i=1;
    while(i<len){
        odd=odd+(num[i]-'0');
        i+=2;
    }
    return odd==even;
}
/*
class Solution {
    public boolean isBalanced(String num) {
        int s1=0,s2=0;
        for(int i=0;i<num.length();i+=2){
            s1+=(num.charAt(i)-'0');
        }
        for(int i=1;i<num.length();i+=2){
            s2+=(num.charAt(i)-'0');
        }
        return s1==s2;
    }
}
*/
