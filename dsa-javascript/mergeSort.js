function mergeSort(array) {
    var length = array.length - 1;
    //base case for this 
    if (length <= 1)
        return;
    var middle = Math.abs(length / 2);
    //adding to the left array
    var leftArray = [];
    var rightArray = [];
    for (var i = 0; i < middle; i++) {
        leftArray[i] = array[i];
    }
    for (var j = 0; j < length; j++) {
        rightArray[j + middle] = array[middle + j];
    }
    leftArray.forEach(function (element) {
        console.log("leftArray elements: ".concat(element));
    });
    rightArray.forEach(function (element) {
        console.log("rightArray elements: ".concat(element));
    });
    array.forEach(function (element) {
        console.log("array elements: ".concat(element));
    });
}
var array = [78, 3, 12, 4, 8, 90, 56];
mergeSort(array);
