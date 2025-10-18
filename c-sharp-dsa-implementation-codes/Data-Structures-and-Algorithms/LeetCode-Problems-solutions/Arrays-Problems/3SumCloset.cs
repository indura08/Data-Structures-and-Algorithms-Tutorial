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
            int closestToTarget = nums[0] + nums[1] + nums[2];
            for (int i = 0; i <= nums.Length - 3; i++)
            {
                for (int k = 1; k < nums.Length - 2; k++)
                {
                    for (int j = nums.Length - 1; j > k; j--)
                    {
                        int tripletsum = nums[i] + nums[k] + nums[j];

                        if (Math.Abs(target - tripletsum) < Math.Abs(target - closestToTarget))
                        {
                            closestToTarget = tripletsum;
                        }

                    }
                }
            }
            return closestToTarget;
        }

        //in this method , it gives wrong answer for: [-1,2,1,-4] array


    }
}
