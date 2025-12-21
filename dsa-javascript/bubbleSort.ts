function bubblesort (array:number[]):number[]{

    for(let i = 0; i<array.length - 1; i++){
        for(let j=0 ; j <array.length - 1 ; j++){
            let prevValue = array[j];
            let nextvalue = array[j+1];

            if(nextvalue === undefined || prevValue === undefined){
                continue;
            }
            if(prevValue > nextvalue){
                array[j] = nextvalue
                array[j+1] = prevValue
            }
        }
    }

    return array;
}

const arrayy:number[] = [5,45,2,12,31,67,95,3,8]
const resultArray = bubblesort(arrayy);

arrayy.forEach(element => {
    console.log(`The un-sorted new array element ${element}`);
});
