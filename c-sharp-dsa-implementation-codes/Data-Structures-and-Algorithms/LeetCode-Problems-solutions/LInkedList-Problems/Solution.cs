using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.LInkedList_Problems
{
    public class Solution
    {
        public ListNode MergeTwoLists(ListNode list1, ListNode list2)
        {
            if (list2 == null) return list1;
            if (list1 == null) return list2;
            ListNode dummy = new ListNode(0);
            
            MergeTwoListsHelper(list1, list2, dummy);
            
            return dummy.next;
        }
        public void MergeTwoListsHelper(ListNode list1, ListNode list2, ListNode dummy)
        {
            while (list1 != null && list2 != null) //awalk giyoth meka and krla blnna
            {
                if (list1.val <= list2.val)
                {
                    dummy.next = list1;
                    list1 = list1.next;
                }
                else if (list1.val >= list2.val)
                {
                    dummy.next = list2;
                    list2 = list2.next;
                }

                dummy = dummy.next;
            }

            while (list1 != null)
            {
                dummy.next = list1;
                list1 = list1.next;
                dummy = dummy.next;
            }

            while (list2 != null)
            {
                dummy.next = list2;
                list2 = list2.next;
                dummy = dummy.next;
            }

        }
    }
}

