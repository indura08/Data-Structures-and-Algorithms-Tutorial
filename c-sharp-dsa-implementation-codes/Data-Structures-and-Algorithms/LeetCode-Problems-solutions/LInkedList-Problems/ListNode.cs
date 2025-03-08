using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.LInkedList_Problems
{
    public class ListNode
    {
        public int val;
        public ListNode next;

        public ListNode(int value, ListNode node = null)
        {
            val = value;
            next = node;
        }
        
    }
}
