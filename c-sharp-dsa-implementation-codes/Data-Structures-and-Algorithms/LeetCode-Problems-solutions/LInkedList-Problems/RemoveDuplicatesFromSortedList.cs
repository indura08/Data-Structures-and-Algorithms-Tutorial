using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.LInkedList_Problems
{
    public class RemoveDuplicatesFromSortedList
    {
        public ListNode DeleteDuplicates(ListNode head)
        {
            if (head == null) return null!;
            ListNode curretNode = head;

            while (curretNode != null && curretNode.next != null)
            {
                if (curretNode.val == curretNode.next.val)
                {
                    if (curretNode.next.next != null)
                    {
                        curretNode.next = curretNode.next.next;
                    }
                    else 
                    {
                        curretNode.next = null!;
                    }
                }
                curretNode = curretNode.next;
                
            }

            ListNode remainingFirstNode = head;
            while (remainingFirstNode != null && remainingFirstNode.next!=null)
            {
                if (remainingFirstNode.val == remainingFirstNode.next.val)
                {
                    remainingFirstNode.next = null!;
                }
                remainingFirstNode = remainingFirstNode.next;
            }
            return head;
        }
    }
}
