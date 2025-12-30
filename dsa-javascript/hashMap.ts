function countFrequency(array:number[]):Map<number,number>{
    const map = new Map<number, number>();

    for(const num of array){
        map.set(num, (map.get(num) ?? 0) +1)
    }

    return map
}

const array:number[] = [1,1,1,1,1,1,4,3,2,6,8,4,8,9,1,2,4,7,7,7,7,7,8,4,9,0,0,2,0,0,3,3,5,6,3,5,8]
const map:Map<number, number> = countFrequency(array);

console.log(map)
