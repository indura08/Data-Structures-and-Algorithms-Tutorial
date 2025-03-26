using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class _3Sum
    {
        public IList<IList<int>> ThreeSum(int[] nums)
        {
            List<List<int>> matchingTrplets = new List<List<int>>();
            bool sequeneEqual = false;
            for (int i = 0; i < nums.Length - 2; i++)
            {
                for (int j = nums.Length - 1; j > i; j--)
                {
                    for (int k = j - 1; k > i; k--)
                    {
                        if (nums[i] + nums[j] + nums[k] == 0)
                        {
                            List<int> newList = new List<int>();
                            newList.Add(nums[i]);
                            newList.Add(nums[j]);
                            newList.Add(nums[k]);

                            foreach (List<int> currentList in matchingTrplets)
                            {
                                if (newList.OrderBy(x => x).SequenceEqual(currentList.OrderBy(x => x)))
                                {
                                    sequeneEqual = true;
                                }
                            }

                            if (!sequeneEqual)
                            {
                                matchingTrplets.Add(newList);
                            }
                            
                        }
                    }
                }
            }

            return matchingTrplets.Cast<IList<int>>().ToList();

            // 71/314 test caes passed , eka array ekaka awalk thiynwa eka blnna 
        }
    }
}
