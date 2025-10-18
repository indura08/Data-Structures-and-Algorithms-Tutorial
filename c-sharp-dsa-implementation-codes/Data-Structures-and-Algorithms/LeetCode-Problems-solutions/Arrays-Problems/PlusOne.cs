using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class PlusOne
    {
        public static int[] PlusOneMethod(int[] digits)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digits.Length; i++)
            {
                sb.Append(digits[i]);     
            }

            BigInteger plusOneINteger = BigInteger.Parse(sb.ToString()) + 1;

            int[] final = new int[plusOneINteger.ToString().Length];
            for (int i = 0; i < plusOneINteger.ToString().Length; i++)
            {
                final[i] = int.Parse(plusOneINteger.ToString()[i].ToString());
      
            }

            return final;
        }
    }
}
