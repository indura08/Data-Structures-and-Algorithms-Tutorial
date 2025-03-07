using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.Json.Serialization.Metadata;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class _3SumCloset
    {
        public int ThreeSumCloset(int[] nums, int target)
        {
            int difference = target;
            int closestToTarget = 0;
            for (int i = 0; i <= nums.Length - 3; i++)
            {
                for (int j = 1; j < nums.Length-1; j++)
                {
                    if ((Math.Abs((target - (nums[i] + nums[i + 1] + nums[i + 1 + j]))) <= difference)  && ((target - (nums[i] + nums[i + 1] + nums[i + 1 + j])) > -1))
                    {
                        closestToTarget = nums[i] + nums[i + 1] + nums[i + 1 + j];
                    }
                }
            }
            return closestToTarget;
        }

        //in this metrhod , it gives wrong answer for: [-1,2,1,-4] array


    }
}
