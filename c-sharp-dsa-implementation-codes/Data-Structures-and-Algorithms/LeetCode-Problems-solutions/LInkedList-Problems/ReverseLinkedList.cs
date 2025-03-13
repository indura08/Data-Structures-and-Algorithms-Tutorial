using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.LInkedList_Problems
{
    public class ReverseLinkedList
    {
        public ListNode ReverseList(ListNode head)
        {
            if (head == null) return null;
            ListNode lastNode = head;
            int count = 0;
            while (lastNode.next != null)
            {
                count++;
                lastNode = lastNode.next;
            }
            
            ReverseListHelper(lastNode, head, count);

            head = lastNode;
            return head;
        }

        public void ReverseListHelper(ListNode lastnode, ListNode HeadNode, int count)
        {
            if (count == 0)
            {
                return;
            }
            ListNode currentNode2 = HeadNode;
            for (int i = count - 1; i > 0; i--)
            {
                if (currentNode2.next != null)
                {
                    currentNode2 = currentNode2.next;
                }
            }

            lastnode.next = currentNode2;
            currentNode2.next = null;
            ReverseListHelper(lastnode, HeadNode, count - 1);
        }
    }
}
