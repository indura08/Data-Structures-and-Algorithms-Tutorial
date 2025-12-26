function mergeSort(array:number[]):void{
    const length = array.length - 1;
    //base case for this 
    if(length <= 1) return;

    let middle = Math.abs(length/2);

    //adding to the left array
    let leftArray:number[] = [];
    let rightArray:number[] = []

    //mka array.slice() daalath puluwan
    for(let i = 0; i < middle; i++){
        leftArray[i] = array[i]
    }

    //mekath array.slice() daalath puluwan
    for(let j = 0; j<length; j++){
        rightArray[j + middle] = array[middle + j];
    }

    leftArray.forEach((element:number) => {
        console.log(`leftArray elements: ${element}`)
    })

    rightArray.forEach((element:number) => {
        console.log(`rightArray elements: ${element}`)
    })

    array.forEach((element:number) => {
        console.log(`array elements: ${element}`)
    })

    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
}

function merge(leftArray:number[], rightArray:number[], array:number[]){
    
}

let array:number[] = [78,3,12,4,8,90,56];
mergeSort(array);
