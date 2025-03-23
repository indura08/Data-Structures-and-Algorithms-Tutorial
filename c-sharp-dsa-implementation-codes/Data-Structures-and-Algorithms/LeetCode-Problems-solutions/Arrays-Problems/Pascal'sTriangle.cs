using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems
{
    public class Pascal_sTriangle
    {
        public IList<IList<int>> Generate(int numRows)
        {
            IList<IList<int>> mainList = new List<IList<int>>();
            
            if (numRows == 1)
            {
                mainList.Add(new List<int> { 1 });
                return mainList;
            }
            if (numRows > 1)
            {
                mainList.Add(new List<int> { 1 });
                mainList.Add(new List<int> { 1,1 });
                if (numRows == 2)
                {
                    return mainList;
                }
                else 
                {
                    for (int i = 2; i < numRows; i++)
                    {
                        List<int> newList = new List<int>();
                        newList.Add(1); 
                        var lastList = mainList[mainList.Count - 1];
                        for (int j = 0; j < lastList.Count - 1; j++)
                        {
                            newList.Add(lastList[j] + lastList[j + 1]); 
                        }
                        newList.Add(1);
                        mainList.Add(newList);
                    }
                }
            }
            
            return mainList;
        }
    }
}
