class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int peak;
        boolean c = true;
        if(arr.length == 1 || arr[0]>=arr[1]){
            return false;
        }
        for(i=0;i<arr.length-1;i++){
            if(c && arr[i]<arr[i+1]){
                continue;
            } else if(c && arr[i] > arr[i+1]){
                peak = arr[i];
                c=false;
            } else if(!c && arr[i] > arr[i+1]){
                continue;
            } else if(!c && arr[i]<arr[i+1]){
                return false;
            } else {
                return false;
            }
        }
        return true && !c;
    }
}
// or
// class Solution {
//     public boolean validMountainArray(int[] arr) {
//         if( arr.length < 3) return false;

//         int l=0,r=arr.length -1;
//         while(l+1 < arr.length-1 && arr[l] < arr[l+1]){
//             l++;
//         } 
//         while(r -1>0 && arr[r]<arr[r-1]){
//             r--;
//         }
//         return l==r;
//     }
// }
