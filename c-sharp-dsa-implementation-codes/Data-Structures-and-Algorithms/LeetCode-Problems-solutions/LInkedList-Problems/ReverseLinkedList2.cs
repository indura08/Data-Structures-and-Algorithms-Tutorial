using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.LInkedList_Problems
{
    public class ReverseLinkedList2
    {
        public ListNode ReverseBetween(ListNode head, int left, int right)
        {
            ListNode dummyNode = head;
            int i = 1;
            while (i != left)
            {
                dummyNode = dummyNode.next;
                i++;
            }

            return head;
            //todo-meke okoma implment krnna meke first part ek iwar krla
        }
    }
}
