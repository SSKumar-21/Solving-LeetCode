/*
just take a array of size n, and intalise the values to 1. the 0th and 1st element will be 0.
run the loop and the table is form:
2,4,6,8,10,.....
3,6,9,12,15,......
4,8,12(will not form as already cover in 2's table)
5,10,15,20,......
as this table is form make every element at that index 0

and in end all the prime no. will left.

calculate the no. of 1's present in that arr and that will ur ans
*/
int countPrimes(int n) {
    if(n<2){
        return 0;
    }
    
    int prime=0,i,j,arr[n];
    arr[0]=0;
    arr[1]=0;
    
    for(i=2;i<n;i++){
        arr[i]=1;
    }
    
    for(i=2;i*i<=n;i++){
        for(j=i*i;j<n;j+=i){
            arr[j]=0;
        }
    }
    for(i=0;i<n;i++){
        if(arr[i]){
            prime++;
        }
    }
    return prime;
}
