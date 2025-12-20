function binarySearch(array:number[], target:number):number {

    let low:number = 0;
    let high:number = array.length - 1;

    while (low <= high){

        let middle:number = Math.floor(low + (high - low)/2);

        console.log(`Middle value is ${middle} and its associated value is ${array[middle]}`)
        let middelValue:number = array[middle]! //to explicitly tell typescript compiler that this value will not be null at any point of 

        if(middelValue > target){
            high = middle - 1;
        }else if(middelValue < target){
            low = middle + 1;
        }else {
            return middelValue;
        }
    }
    return -1
}

const array:number[] = [34,56,57,90,97, 98,99,102,103,104,190]
const result:number = binarySearch(array, 9)

result === -1 ? console.log(`The target value could not be found`) 
              : console.log(`Result was found and the result is located on the array position of ${result}`);

