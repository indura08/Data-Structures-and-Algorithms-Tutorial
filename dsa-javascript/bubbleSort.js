function bubblesort(array) {
    for (var i = 0; i < array.length - 1; i++) {
        for (var j = 0; j < array.length - 1; j++) {
            var prevValue = array[j];
            var nextvalue = array[j + 1];
            if (nextvalue === undefined || prevValue === undefined) {
                continue;
            }
            if (prevValue > nextvalue) {
                array[j] = nextvalue;
                array[j + 1] = prevValue;
            }
        }
    }
    return array;
}
var arrayy = [5, 45, 2, 12, 31, 67, 95, 3, 8];
//const resultArray = bubblesort(arrayy);
arrayy.forEach(function (element) {
    console.log("The un-sorted new array element ".concat(element));
});
console.log("");
// resultArray.forEach(element => {
//     console.log(`The sorted new array element ${element}`);
// });
