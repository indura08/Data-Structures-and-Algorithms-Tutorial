function binarySearch(array, target) {
    var low = 0;
    var high = array.length - 1;
    while (low <= high) {
        var middle = Math.floor(low + (high - low) / 2);
        console.log("Middle value is ".concat(middle, " and its associated value is ").concat(array[middle]));
        var middelValue = array[middle]; //to explicitly tell typescript compiler that this value will not be null at any point of 
        if (middelValue > target) {
            high = middle - 1;
        }
        else if (middelValue < target) {
            low = middle + 1;
        }
        else {
            return middelValue;
        }
    }
    return -1;
}
var array = [34, 56, 57, 90, 97, 98, 99, 102, 103, 104, 190];
var result = binarySearch(array, 9);
result === -1 ? console.log("The target value could not be found")
    : console.log("Result was found and the result is located on the array position of ".concat(result));
