function interpolationSearch(array, target) {
    var startTime = Date.now();
    var low = 0;
    var high = array.length - 1;
    while (target >= array[low] && target <= array[high] && low <= high) {
        var prob = Math.floor(low + (target - array[low]) * (high - low) / (array[high] - array[low]));
        //harinm mehtna division by zero eka care krnna one
        //const prob = low + (distacnce fromt he start/total value of range) * (high value - low value)
        console.log("The prob value is : ".concat(prob, " and correspionding array element is : ").concat(array[prob]));
        if (target > array[prob]) {
            low = prob + 1;
        }
        else if (target < array[prob]) {
            high = prob - 1;
        }
        else {
            return prob;
        }
    }
    var endTime = Date.now();
    console.log("Total time took for excution is : ".concat(endTime - startTime));
    return -1;
}
var array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var array2 = [33, 39, 43, 42, 40, 57, 90];
var result = interpolationSearch(array, 10);
result !== -1 ? console.log("The target was found at index of ".concat(result)) : console.log("The target is not inside the array");
