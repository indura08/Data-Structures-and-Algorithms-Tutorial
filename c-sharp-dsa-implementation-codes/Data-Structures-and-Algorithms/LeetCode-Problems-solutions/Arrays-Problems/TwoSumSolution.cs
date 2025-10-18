using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class TwoSumSolution
    {
        public int[] TwoSum(int[] nums, int target)
        {

            int[] indexes = new int[2];
            
            for (int i = 0; i < nums.Length; i++)
            {
                for (int j = 0; j < nums.Length; j++)
                {
                    if ((nums[j] + nums[i] == target) && (j != i))
                    {
                        indexes[0] = i;
                        indexes[1] = j;
                        break;
                    }
                    
                }
            }

            return indexes;
        }
    }
}
