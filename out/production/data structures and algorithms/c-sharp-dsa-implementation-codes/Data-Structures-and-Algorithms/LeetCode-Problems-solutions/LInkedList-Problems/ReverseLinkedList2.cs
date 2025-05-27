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
            if (left == right)
            {
                return head;
            }

            if (left == 1 && right == 2)
            {
                if (head.next.next == null)
                {
                    ListNode tempo = head.next;
                    head.next = null!;
                    tempo.next = head;
                    head = tempo;
                    return head;
                }
                else 
                {
                    ListNode tempo = head;
                    for (int i = 0; i < right; i++)
                    {
                        tempo = tempo.next;
                    }
                    ListNode lastNode0 = head.next;
                    ListNode FirstNode = head;
                    ReverseBetweenHelper(lastNode0, FirstNode, (right - left) + 1);

                    head.next.next = null;
                    head = lastNode0;
                    lastNode0.next = tempo;


                }
            }

            ListNode firstNodeBeforeLeft = head;
            for (int i = 1; i < left-1; i++)
            {
                firstNodeBeforeLeft = firstNodeBeforeLeft.next;
            }

            ListNode lastNode = head;
            for (int i = 1; i < right; i++)
            {
                lastNode = lastNode.next;
            }

            ListNode firstNodeAfterRight = lastNode.next;

            ReverseBetweenHelper(lastNode, firstNodeBeforeLeft.next, (right - left) + 1);

            firstNodeBeforeLeft.next = lastNode;
            ListNode temp = head;
            for (int j = 1; j < right; j++)
            {
                temp = temp.next;
            }

            temp.next = firstNodeAfterRight;

            return head;
        }

        public void ReverseBetweenHelper(ListNode lastNode, ListNode firstNode, int count)
        {
            if (count == 1) return;
            ListNode dummyFirst = firstNode;

            for (int i = 1; i < count-1; i++)
            {
                dummyFirst = dummyFirst.next;
            }

            lastNode.next = dummyFirst;
            //dummyFirst = null;
            ReverseBetweenHelper(lastNode.next, firstNode, count - 1);
        }
    }

    //this solution impllementation only accpeted for 30 test cases , samml error there to fix?

}
