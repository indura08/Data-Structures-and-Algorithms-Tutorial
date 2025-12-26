function insertionSort(array:number[]):void{

    for(let i = 1; i < array.length - 1; i++){
        let temp = array[i];
        for(let j = i; j>0; j--){
            if(array[j-1]! > temp!){
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }
} 

let array = [23,12,42,41,79,34,81,57]

insertionSort(array);

array.forEach((Element:number) => {
    console.log(`sorted array element is : ${Element}`);
})