using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class RemoveDuplicateFromSortedArray
    {
        public int[] RemoveDuplicates(int[] nums) 
        {
            int first = 0;
            int second = first + 1;
            List<int> newList = new List<int>();

            while (first > nums.Length - 1)
            {
                if (nums[first] != nums[second])
                {
                    newList.Add(nums[first]);
                }

                first++;
                second++;
            }

            int[] nums2 = [];
            newList.CopyTo(nums2);

            return nums2;

            // this problem was wrong since in the solution it accepts to rerturna integre but in test cases it mention a array as result
        }
    }
}
