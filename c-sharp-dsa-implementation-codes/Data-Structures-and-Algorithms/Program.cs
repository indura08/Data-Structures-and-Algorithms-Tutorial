using Data_Structures_and_Algorithms.Sorting_algortihms;
using System.Collections.Generic;

namespace Data_Structures_and_Algorithms
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arrayToBeSorted = {   738, 123, 987, 564, 321, 876, 432, 100, 765, 901,
                                        654, 345, 789, 234, 567, 890, 456, 678, 210, 890,
                                        112, 223, 334, 445, 556, 667, 778, 889, 990, 101,
                                        202, 303, 404, 505, 606, 707, 808, 909, 111, 222,
                                        333, 444, 555, 666, 777, 888, 999, 131, 242, 353,
                                        464, 575, 686, 797, 808, 919, 929, 939, 949, 959,
                                        969, 979, 989, 999, 111, 121, 131, 141, 151, 161,
                                        171, 181, 191, 201, 211, 221, 231, 241, 251, 261,
                                        271, 281, 291, 301, 311, 321, 331, 341, 351, 361,
                                        371, 381, 391, 401, 411, 421, 431, 441, 451, 461 };

            //BubbleSort.BubbleSortAlgorithm(arrayToBeSorted);
            //SelectionSort.SelectionSortAlgorithm(arrayToBeSorted);

            //InsertionSort.InsertionSortAlgorithm(arrayToBeSorted);

            //MergeSort.MergeSortAlgorithm(arrayToBeSorted);

            QuickSort.QuickSortAlgorithm(arrayToBeSorted, 0, arrayToBeSorted.Length - 1);

            for (int i = 0; i <= arrayToBeSorted.Length - 1; i++)
            {
                Console.Write(arrayToBeSorted[i] + ", ");
            }

            
            
        }
    }
}
