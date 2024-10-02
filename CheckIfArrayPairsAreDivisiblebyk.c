bool canArrange(int* arr, int arrSize, int k) {
    int ans[k],i,j,x;

/*
Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return true If you can find a way to do that or false otherwise.
*/



 /*
i have made a array of name "ans". this array will store the occurance of reminder from arr in nums means
1%7=1
8%7=1
then ans[1]=2;
means occurence of remindier 1 is 2 
remindier is index number and occurance is its index value of ans

in strating all the occurance is 0 therefore all the element of ans is 0
  */
	for(i=0; i<k; i++) {
		ans[i]=0;
	}

	for(i=0; i<arrSize; i++) {
		x=arr[i]%k;
		if(x<0) {
			x+=k;
		}
		ans[x]++;
	}


  /*
  remindier 0 can only be possible if there is k or multiple of k in the arr.
and as there is no element repeated , (k,k) cant be the pair hence having the multiple of k or k in arr leads not to statisfy the condition of the question
    */

	if (ans[0]%2!=0) {
		return 0;
	}

  /*
as we know that ans array have occurance 1 remindier on index one,  2 remindier on index two, and so on.
then for making the pairs of number the occurance of remindier 1 should be equal to occurance of  remindier  k-1
means
if k=7
the ans[1]==ans[k-1] => arr[6]
if the occurance is not same then pair cant be make and leads not to statisfy the condition of the question
*/

	for (int i = 1; i <= k / 2; i++) {
		if (ans[i] != ans[k - i]) {
			return false;
		}
	}
/*
till now i have removed every condition of false now we can return true value from the function
*/
	return 1;    
}
