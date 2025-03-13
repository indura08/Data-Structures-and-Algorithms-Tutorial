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
            ListNode firstNodeBeforeLeft = head;
            for (int i = 1; i > left-1; i++)
            {
                firstNodeBeforeLeft = firstNodeBeforeLeft.next;
            }

            ListNode firstNodeAfterRight = head;
            for (int i = 1; i <= right-1; i++)
            {
                firstNodeAfterRight = firstNodeAfterRight.next;
            }

            ListNode swapNode = firstNodeBeforeLeft.next;
            for (int i = 0; i < (right - left) + 1; i++)
            {
                //todo - complete this loop too
            }
            return head;
            //todo-meke okoma implment krnna meke first part ek iwar krla
        }
    }
}
