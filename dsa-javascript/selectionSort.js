function selectionSort(array) {
    for (var i = 0; i < array.length - 1; i++) {
        var minValue = i;
        if (minValue === undefined) {
            continue;
        }
        for (var j = i + 1; j < array.length - 1; j++) {
            var currentValue = array[j];
            if (currentValue === undefined) {
                continue;
            }
            if (currentValue < minValue) {
                minValue = j;
            }
        }
        var temp = array[i];
        array[i] = array[minValue];
        array[minValue] = temp;
    }
    return array;
}
var array = [45, 12, 29, 71, 59, 27, 8, 10];
selectionSort(array);
array.forEach(function (element) {
    console.log("sorted array element: ".concat(element));
});
