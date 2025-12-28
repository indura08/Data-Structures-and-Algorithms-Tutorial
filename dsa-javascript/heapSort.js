function heapSort(array) {
    var _a;
    var n = array.length;
    for (var i = Math.floor(n / 2) - 1; i >= 0; i--) {
        heapify(array, n, i);
    }
    for (var i = n - 1; i > 0; i--) {
        _a = [array[i], array[0]], array[0] = _a[0], array[i] = _a[1];
        heapify(array, i, 0);
    }
}
function heapify(array, heapSize, rootIndex) {
    var _a;
    var largest = rootIndex;
    //to see where is the left child
    var left = 2 * rootIndex + 1;
    //to see where is the right child
    var right = 2 * rootIndex + 2;
    if (left < heapSize && array[left] > array[largest]) {
        largest = left;
    }
    if (right < heapSize && array[right] > array[largest]) {
        largest = right;
    }
    if (rootIndex !== largest) {
        //if array passed largest element is changd in above codes we swap its value with rootindex
        _a = [array[largest], array[rootIndex]], array[rootIndex] = _a[0], array[largest] = _a[1];
        heapify(array, heapSize, largest);
    }
}
var array = [4, 10, 3, 1, 5, 67, 23, 7, 12, 6, 4, 51, 79, 52, 37, 83, 33];
heapSort(array);
array.forEach(function (element) {
    console.log("The array elements afetr sorting is : ".concat(element));
});
