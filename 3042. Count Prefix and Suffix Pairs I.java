class Solution {
    private  boolean isPrefixAndSuffix(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }

    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
            if(isPrefixAndSuffix(words[i],words[j])){
                c++;
            }
            }
        }
        return c;
    }
}
/*
bool isPrefixAndSuffix(char *str1,char *str2){
    int len1=strlen(str1);
    int len2 =strlen(str2);
    if(len1>len2){
        return false;
    }

    if(strncmp(str1,str2,len1) != 0){
        return false;
    }

    if(strncmp(str1,str2 +len2- len1,len1) != 0){
        return false;
    }
    return true;
}

int countPrefixSuffixPairs(char** words, int wordsSize) {
    int c=0;
        for(int i=0;i<wordsSize;i++){
            for(int j=i+1;j<wordsSize;j++){
            if(isPrefixAndSuffix(words[i],words[j])){
                c++;
            }
            }
        }
        return c;
}
*/
