/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    function toBe(value){
        if(val===value){
            return true;
        }
        else{
            throw new Error ("Not Equal");
        }
    }
    function notToBe(value){
        if(val!==value){
            return true;
        }
        else{
            throw new Error ("Equal");
        }
    }
    return{
        toBe,notToBe
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */

/*
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    let obj={
        toBe(value){
        if(val===value){
            return true;
        }
        else{
            throw new Error ("Not Equal");
        }
    },
    notToBe(value){
        if(val!==value){
            return true;
        }
        else{
            throw new Error ("Equal");
        }
    }
    }
    return obj;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
*/
