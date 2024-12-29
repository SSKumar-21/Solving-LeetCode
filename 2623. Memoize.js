/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let cache={};
    return function(...args) {
        let i= JSON.stringify(args); // multile argument is converted into the string
        if(i in cache){ // if data is present in cache then get the result from the cache
            return cache[i]; 
        }
        else{ //if data is not present in cache then result will be calculated and then store in cache[n]
            let res=fn.apply(this,args);
            cache[i]=res;
            return res;
        }
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */
