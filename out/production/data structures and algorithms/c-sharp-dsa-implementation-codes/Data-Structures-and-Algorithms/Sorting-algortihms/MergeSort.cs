using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Sorting_algortihms
{
    internal class MergeSort
    {
        public static void MergeSortAlgorithm(int[] array) {

            if (array.Length <= 1)
            {
                return;
            }

            int middle = array.Length / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[array.Length - middle];

            for (int i = 0; i < leftArray.Length; i++)
            {
                leftArray[i] = array[i];
            }
            
            for (int j = 0; j < rightArray.Length; j++)
            {
                rightArray[j] = array[j + middle];
            }

            MergeSortAlgorithm(leftArray);
            MergeSortAlgorithm(rightArray);
            Merge(array, leftArray, rightArray);           

        }

        public static void Merge(int[] array, int[] leftArray, int[] rightArray)
        {
            int leftSize = array.Length / 2;
            int rightSize = array.Length - leftSize;
            int i = 0, l = 0, r = 0;

            while (leftSize > l && rightSize > r)
            {
                if (leftArray[l] < rightArray[r])
                {
                    array[i] = leftArray[l];
                    i++;
                    l++;
                }

                else 
                {
                    array[i] = rightArray[r];
                    r++;
                    i++;
                }
            }

            while (l < leftSize)
            {
                array[i] = leftArray[l];
                i++;
                l++;
            }

            while (r < rightSize)
            {
                array[i] = rightArray[r];
                i++;
                r++;
            }


        }

    }
}
