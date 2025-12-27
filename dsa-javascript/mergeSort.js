function mergeSort(array) {
    var length = array.length;
    //base case for this 
    if (length <= 1)
        return;
    var middle = Math.floor(length / 2);
    //adding to the left array
    var leftArray = [];
    var rightArray = [];
    //mka array.slice() daalath puluwan
    for (var i = 0; i < middle; i++) {
        leftArray[i] = array[i];
    }
    //mekath array.slice() daalath puluwan
    for (var j = 0; j < length - middle; j++) {
        rightArray[j] = array[middle + j];
    }
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
}
function merge(leftArray, rightArray, array) {
    var l = 0, r = 0, a = 0;
    //mereging all the elements from leftarray to main array and right array  main array
    while (l < leftArray.length && r < rightArray.length) {
        if (leftArray[l] < rightArray[r]) {
            array[a] = leftArray[l];
            l++;
            a++;
        }
        else {
            array[a] = rightArray[r];
            a++;
            r++;
        }
    }
    //now we hvae to merge remaining elements of the two arrays left and right (because in above while loop we compare leftarray and rightarray and after that there can be some remaining elemets inside both arrays)
    //so this is for left arrays remining elements
    while (l < leftArray.length) {
        array[a] = leftArray[l];
        a++;
        l++;
    }
    while (r < rightArray.length) {
        array[a] = rightArray[r];
        a++;
        r++;
    }
}
var array = [78, 3, 12, 4, 8, 90, 56, 33, 89, 34, 90, 54, 19, 67, 54, 7, 77, 88, 91, 15, 62, 32, 49, 44, 54, 67, 69, 42, 95, 86, 39, 17, 9, 37, 86];
mergeSort(array);
array.forEach(function (element) {
    console.log("The array after sort is : ".concat(element));
});
