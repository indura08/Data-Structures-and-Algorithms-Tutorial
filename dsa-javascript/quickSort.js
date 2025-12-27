function quicksort(array, start, end) {
    if (end <= start)
        return;
    var pivot = partition(array, start, end);
    quicksort(array, start, pivot - 1);
    quicksort(array, pivot + 1, end);
}
function partition(array, start, end) {
    var i = start - 1;
    for (var j = start; j <= end; j++) {
        if (array[end] > array[j]) {
            i++;
            var temp_1 = array[j];
            array[j] = array[i];
            array[i] = temp_1;
        }
    }
    i++;
    var temp = array[end];
    array[end] = array[i];
    array[i] = temp;
    return i;
}
var array = [78, 3, 12, 4, 8, 90, 56, 33, 89, 34, 90, 54, 19, 67, 54, 7, 77, 88, 91, 15, 62, 32, 49, 44, 54, 67, 69, 42, 95, 86, 39, 17, 9, 37, 86];
quicksort(array, 0, array.length - 1);
array.forEach(function (Element) {
    console.log("sorted array is : ".concat(Element));
});
