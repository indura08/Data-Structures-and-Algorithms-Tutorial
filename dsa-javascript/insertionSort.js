function insertionSort(array) {
    for (var i = 1; i < array.length - 1; i++) {
        var temp = array[i];
        for (var j = i; j > 0; j--) {
            if (array[j - 1] > temp) {
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }
}
var array = [23, 12, 42, 41, 79, 34, 81, 57];
insertionSort(array);
array.forEach(function (Element) {
    console.log("sorted array element is : ".concat(Element));
});
