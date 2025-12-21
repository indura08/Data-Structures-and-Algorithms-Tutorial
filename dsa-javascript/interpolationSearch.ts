function interpolationSearch(array:number[], target:number):number{

    const startTime = Date.now();

    let low = 0;
    let high = array.length - 1;

    while(target >= array[low]! && target <= array[high]! && low <= high){

        const prob = Math.floor(low + (target - array[low]!) * (high - low) / (array[high]! - array[low]!))
        //harinm mehtna division by zero eka care krnna one
        //const prob = low + (distacnce fromt he start/total value of range) * (high value - low value)
        
        console.log(`The prob value is : ${prob} and correspionding array element is : ${array[prob]}`)

        if(target > array[prob]!){
            low = prob + 1
        }else if(target < array[prob]!){
            high = prob - 1
        }else{
            return prob;
        }
    }

    const endTime = Date.now();
    console.log(`Total time took for excution is : ${endTime - startTime}`);
    return -1;

    
}

const array:number[] = [1,2,3,4,5,6,7,8,9,10]
const array2:number[] = [33,39,43,42,40,57,90]
const result:number = interpolationSearch(array, 10);

result !== -1 ? console.log(`The target was found at index of ${result}`): console.log(`The target is not inside the array`);


