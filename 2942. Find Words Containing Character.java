class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                res.add(i);
            }
        }
        return res;
    }
}



/*
int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    int *arr=malloc(sizeof(int)*wordsSize);
    int index=0;
    *returnSize=0;
    for (int i=0;i<wordsSize;i++) {
        if (strchr(words[i], x) != NULL) {
            *(arr+index)=i;
            (*returnSize) += 1;
            index++;
        }
    }
    return arr;
}
*/
