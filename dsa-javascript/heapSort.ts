function heapSort(array:number[]):void{
    const n = array.length;

    //methana n/2 - 1 kiyna value ekt adu values wala array eke elements walata thami childs la inne value ek > n/2 -1 nam childs la nha (note ek kiywanna) 
    for(let i = Math.floor(n/2) - 1; i>=0; i--){
        heapify(array, n, i);
    }

    for(let i = n - 1; i>0; i--){
        [array[0], array[i]] = [array[i], array[0]];

        heapify(array, i, 0);
    }
    
}

function heapify(array:number[], heapSize:number, rootIndex:number):void{
    let largest = rootIndex;
    
    //to see where is the left child
    const left = 2 * rootIndex + 1;
    
    //to see where is the right child
    const right = 2 * rootIndex + 2

    if(left < heapSize && array[left]! > array[largest]!){
        largest = left;
    }

    if(right < heapSize && array[right]! > array[largest]!){
        largest = right
    }

    if(rootIndex !== largest){
        //if array passed largest element is changd in above codes we swap its value with rootindex
        [array[rootIndex], array[largest]] = [array[largest], array[rootIndex]]

        heapify(array, heapSize, largest)
    }

}


let array:number[] = [4,10,3,1,5,67,23,7,12,6,4,51,79,52,37,83,33]
heapSort(array);

array.forEach((element:number) => {
    console.log(`The array elements afetr sorting is : ${element}`);
})