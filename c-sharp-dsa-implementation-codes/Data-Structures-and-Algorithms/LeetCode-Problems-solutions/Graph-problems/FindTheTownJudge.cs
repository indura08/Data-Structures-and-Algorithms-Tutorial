using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Graph_problems
{
    public class FindTheTownJudge
    {
        public int FindJudge(int n, int[][] trust)
        {
            int[,] matrix = new int[n, n];

            for (int i = 0; i < trust.GetLength(0); i++)
            {
                matrix[trust[i][0] -1, trust[i][1]-1] = 1;
            }

            List<int> judgeList = new List<int>();
            for (int j = 0; j < matrix.GetLength(0); j++)
            {
                bool foundOne = false;
                for (int k = 0; k < matrix.GetLength(1); k++)
                {
                    if (matrix[j, k] == 1)
                    {
                        foundOne = true;
                        break;
                    }

                }
                if(!foundOne) judgeList.Add(j);
            }

            if (judgeList.Count == 1)
            {
                for (int l = 0; l < matrix.GetLength(0); l++)
                {
                    if (l == judgeList[0])
                    {
                        continue; 
                    }
                    if (matrix[l, judgeList[0]] == 0)
                    {
                        return -1;
                    }
                    
                }

                return judgeList[0] +1;
            }
            else 
            {
                return -1;
            }
        }
    }
}
