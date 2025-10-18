using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class ContainerWithMostWater
    {
        public int MaxArea(int[] height)
        {
            int maxArea = 0;

            //for (int i = 0; i < height.Length; i++)
            //{
            //    for (int j = 0; j < height.Length; j++)
            //    {
            //        if ((Math.Min(height[i], height[j]) * (j - i) > maxArea) && j != i)
            //        {
            //            maxArea = Math.Min(height[i], height[j]) * (j - i);
            //        }
            //    }
            //} meka O(n^2 nisa loku array ekkt timeout error ekk enwa e hinda meka hariynne nha)

            //int maxIndex = height.Length - 1;
            //for (int i = 0; i < height.Length; i++)
            //{
            //    if ((Math.Min(height[i], height[maxIndex]) * (maxIndex - i) > maxArea) && maxIndex != i)
            //    {
            //        maxArea = Math.Min(height[maxIndex], height[i]) * (maxIndex - i);
            //    }
            //}

            int right = height.Length - 1;
            int left = 0;

            while (left < right)
            {
                if (Math.Min(height[left], height[right]) * (right - left) > maxArea)
                {
                    maxArea = Math.Min(height[left], height[right]) * (right - left);
                }

                if (height[right] > height[left])
                {
                    left++;
                }
                else 
                {
                    right--;
                }
            }

            return maxArea;
        }
    }
}
