int countPrimeSetBits(int left, int right) {
    int primeMask = 0b10100010100010101100; 
    int res = 0;

    for (int i = left; i <= right; i++) {
        int bits = __builtin_popcount(i); 
        if (primeMask & (1 << bits)) { 
            res++;
        }
    }

    return res;
}
/*

int prime(int n){
    if(n==1 || n==0){
        return 0;
    }
    int i,c=1;
    for(i=2;i<n;i++){
        if(n%i==0){
            c=0;
            break;
        }
    }
    return c;
}

int Bits(int n){
    int x=0;
    while(n>0){
        if(n%2==1){
            x++;
        }
        n/=2;
    }
    return x;
}

int countPrimeSetBits(int left, int right) {
    int res=0;
    for(int i=left;i<=right;i++){
        int bits=Bits(i);
        int check=prime(bits);
        if(check==1){
            res++;
            printf("%d->%d\n",i,bits);
        }
    }
    return res;
}

*/
