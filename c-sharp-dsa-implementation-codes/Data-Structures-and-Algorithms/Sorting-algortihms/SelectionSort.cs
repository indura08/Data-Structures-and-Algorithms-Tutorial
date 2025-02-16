using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Sorting_algortihms
{
    internal class SelectionSort
    {
        public static void SelectionSortAlgorithm(int[] array)
        {
            for (int i = 0; i < array.Length; i++)
            {
                for (int j = i + 1; j < array.Length; j++)
                {
                    int min = i;
                    if (array[min] > array[j]) 
                    {
                        min = j;
                    }

                    int temp = array[i];
                    array[i] = array[min];
                    array[min] = temp;

                    //menna me widyt thami .net waldi value dekk swap kraddi krnna puluwan hoda widiya , temp variable ekk gnnwa t wadameka hodi
                    //(array[min], array[i]) = (array[i], array[min]);
                }
            }
        }

    }
}
