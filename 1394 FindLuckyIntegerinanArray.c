int findLucky(int* arr, int arrSize) {
   int check[501] = {0};
    int x = -1, i; 

    for (i = 0; i < arrSize; i++) {
        check[arr[i]]++;
    }

    for (i = 0; i < 501; i++) {
        if (check[i] ==i) {
            x = i;
        }
    }

    return x; 
}
