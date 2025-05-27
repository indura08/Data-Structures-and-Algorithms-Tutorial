using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Sorting_algortihms
{
    internal class QuickSort
    {
        public static void QuickSortAlgorithm(int[] array, int start, int end)
        {
            if (end <= start) return;

            int pivot = partition(array, start, end);
            QuickSortAlgorithm(array, start, pivot - 1);
            QuickSortAlgorithm(array, pivot + 1, end);
        }

        public static int partition(int[] array, int start, int end)
        {
            int pivot = array[end];
            int i = start - 1;

            for (int j = start; j <= end; j++)
            {
                if (pivot > array[j])
                {
                    i++;
                    int temp0 = array[i];
                    array[i] = array[j];
                    array[j] = temp0;        //methna poddk blnna one nathi calculation ekk wnewa mn hitnne : i++ ekn passe i==j nm variables swap krnna one nhane 
                }
            }

            i++;
            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;

            return i;
        }
    }
}
