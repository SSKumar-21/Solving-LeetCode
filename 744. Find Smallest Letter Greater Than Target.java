class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    int l=0,r=letters.length-1,mid;
    while(l<=r){
        mid=l+(r-l)/2;
        if(letters[mid]>target){
            r=mid-1;
        } 
        else{
            l=mid+1;
        }
    }
    return letters[l%letters.length];
    }
}

/*
char nextGreatestLetter(char* letters, int lettersSize, char target) {
    int l=0,r=lettersSize-1,mid;
    while(l<=r){
        mid=l+(r-l)/2;
        if(letters[mid]>target){
            r=mid-1;
        } 
        else{
            l=mid+1;
        }
    }
    return letters[l%lettersSize];
}
*/
