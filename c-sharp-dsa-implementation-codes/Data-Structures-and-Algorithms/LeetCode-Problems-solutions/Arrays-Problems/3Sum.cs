using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class _3Sum
    {
        //public IList<IList<int>> ThreeSum(int[] nums)
        //{
        //    List<List<int>> matchingTrplets = new List<List<int>>();
            
        //    for (int i = 0; i < nums.Length - 2; i++)
        //    {
        //        for (int j = nums.Length - 1; j > i; j--)
        //        {
        //            for (int k = j - 1; k > i; k--)
        //            {
        //                if (nums[i] + nums[j] + nums[k] == 0)
        //                {
        //                    List<int> newList = new List<int>();
        //                    newList.Add(nums[i]);
        //                    newList.Add(nums[j]);
        //                    newList.Add(nums[k]);
        //                    bool sequeneEqual = false;

        //                    foreach (List<int> currentList in matchingTrplets)
        //                    {
        //                        if (newList.OrderBy(x => x).SequenceEqual(currentList.OrderBy(x => x)))
        //                        {
        //                            sequeneEqual = true;
        //                        }
        //                    }

        //                    if (!sequeneEqual)
        //                    {
        //                        matchingTrplets.Add(newList);
                                
        //                    }
                            
        //                }
        //            }
        //        }
        //    }

        //    return matchingTrplets.Cast<IList<int>>().ToList();

        //    // 71/314 test caes passed , eka array ekaka awalk thiynwa eka blnna 
        //}

        public IList<IList<int>> ThreeSum(int[] nums)
        {
            Array.Sort(nums); // Step 1: Sort the array
            List<IList<int>> result = new List<IList<int>>();

            for (int i = 0; i < nums.Length - 2; i++)
            {
                // Skip duplicate values
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1;
                int right = nums.Length - 1;

                while (left < right)
                {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0)
                    {
                        result.Add(new List<int> { nums[i], nums[left], nums[right] });

                        // Skip duplicate values for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < 0)
                    {
                        left++; // Increase sum
                    }
                    else
                    {
                        right--; // Decrease sum
                    }
                }
            }

            return result;
        }
    }
}
