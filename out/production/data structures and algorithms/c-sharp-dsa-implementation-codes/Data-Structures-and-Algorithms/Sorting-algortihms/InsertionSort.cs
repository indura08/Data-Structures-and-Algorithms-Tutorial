using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Sorting_algortihms
{
    internal class InsertionSort
    {
        public static void InsertionSortAlgorithm(int[] array)
        {
            for (int i = 0; i < array.Length - 1; i++)
            {
                int temp = array[i + 1];

                for (int j = i+1; j > 0; j--)
                {
                    if (temp < array[j - 1])
                    {
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }
    }
}
