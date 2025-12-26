function selectionSort(array:number[]):void{
    for(let i = 0; i < array.length - 1; i++){
        let minValue = i;
        if(minValue === undefined){
            continue
        }

        for(let j = i+1 ; j<array.length - 1; j++){
            const currentValue = array[j];
            if(currentValue === undefined){
                continue;
            }

            if(currentValue < array[minValue]!){
                minValue = j
            }
        }

        let temp = array[i];
        array[i] = array[minValue]!
        array[minValue] = temp!

    }

}

const array: number[] = [45,12,29,71,59,27,8,10]
selectionSort(array);

array.forEach((element:number) => {
    console.log(`sorted array element: ${element}`)
})

//this shiould be fioxed , this is wrong

