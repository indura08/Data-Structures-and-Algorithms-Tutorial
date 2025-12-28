function countFrequency(array) {
    var _a;
    var map = new Map();
    for (var _i = 0, array_1 = array; _i < array_1.length; _i++) {
        var num = array_1[_i];
        map.set(num, ((_a = map.get(num)) !== null && _a !== void 0 ? _a : 0) + 1);
    }
    return map;
}
var array = [1, 1, 1, 1, 1, 1, 4, 3, 2, 6, 8, 4, 8, 9, 1, 2, 4, 7, 7, 7, 7, 7, 8, 4, 9, 0, 0, 2, 0, 0, 3, 3, 5, 6, 3, 8];
var map = countFrequency(array);
console.log(map);
