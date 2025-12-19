var LinearSearch = function (array, value) {
    for (var i = 0; i < array.length; i++) {
        if (array[i] === value)
            return i;
    }
    return -1;
};
var array = [23, 16, 33, 61, 90, 12];
var result = LinearSearch(array, 61);
console.log("The number is found in the array and its element number is ".concat(result));
