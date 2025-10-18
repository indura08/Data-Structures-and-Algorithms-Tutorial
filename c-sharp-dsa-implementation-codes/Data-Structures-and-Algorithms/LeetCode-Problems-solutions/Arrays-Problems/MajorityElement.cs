using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public  class MajorityElement
    {
        public int Majorityelement(int[] nums)
        {
            int half = (int)Math.Floor((double)nums.Length / 2);

            Dictionary<int, int> dic = new Dictionary<int, int>();

            foreach (int num in nums)
            {
                if (dic.ContainsKey(num))
                {
                    dic[num]++;
                }
                else 
                {
                    dic[num] = 1;
                }

                if (dic[num] > half) return num;
            }
            return -1;
        }
    }
}
