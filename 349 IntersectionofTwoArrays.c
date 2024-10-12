/**
 * Note: The returned array must be malloced, assume caller calls free().


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */
int* intersect(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int *res = malloc((nums1Size + nums2Size) * sizeof(int)); 
    int check[2001]={0}; //size is 2001 because -1000 to 1000 is 2000 numbers but including 0 we gat 2001 size
    *returnSize=0;
    int i,x=0;
    for(i=0;i<nums1Size;i++){
        check[nums1[i]+1000]++;  // plus 1000 for balacning +ve and -ve number
    }
    for(i=0;i<nums2Size;i++){
       if(check[nums2[i]+1000]){
            res[x++]=nums2[i];
            check[nums2[i]+1000]=0;
            (*returnSize)++;
        }
    }
    return res;
}
