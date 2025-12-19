const LinearSearch = (array: number[], value:number): number => {
    for(let i = 0 ; i < array.length; i++){
        if(array[i] === value) return i;
    }

    return -1
}

const array:number[] = [23,16,33,61,90,12]
const result = LinearSearch(array, 61)

console.log(`The number is found in the array and its element number is ${result}`);