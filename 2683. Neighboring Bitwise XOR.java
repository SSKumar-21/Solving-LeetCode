class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res = derived[0];
        for(int i=1;i<derived.length;i++){
            res = res^derived[i];
        }
        return res==0;
    }
}

/*
bool doesValidArrayExist(int* derived, int derivedSize) {
    int res = derived[0];
        for(int i=1;i<derivedSize;i++){
            res = res^derived[i];
        }
        return res==0;
}
*/
