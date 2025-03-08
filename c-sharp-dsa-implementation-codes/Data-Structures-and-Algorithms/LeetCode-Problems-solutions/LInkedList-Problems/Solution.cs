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
        List<ListNode> newList = new List<ListNode>();
        public ListNode MergeTwoLists(ListNode list1, ListNode list2)
        {
            if (list1 == null || list2 == null)
            {
                if (list1 != null)
                {
                    return list1;
                }
                else if (list2 != null)
                {
                    return list2;
                }
            }
            else 
            {
                MergeTwoListsHelper(list1, list2);
            }

            return list1 != null && list2 != null && list1.val > list2.val ? list2 : list1; 
        }
        public void MergeTwoListsHelper(ListNode list1, ListNode list2)
        {
            if (list1 == null || list2 == null)
            {
                if (list1 != null)
                {
                    while (list1 != null)
                    {
                        newList[^1].next = list1;
                        newList.Add(list1);
                        list1 = list1.next;
                    }
                }
                else if (list2 != null)
                {
                    while (list2 != null)
                    {
                        newList[^1].next = list2;
                        newList.Add(list2);
                        list2 = list2.next;
                    }
                }

                return;
            }

            if (newList.Count == 0 && newList.Count > 0 && list1 != null && list2 != null)
            {
                if (list1.val == list2.val)
                {
                    newList.Add(list1);
                    newList[^1].next = list2;
                    newList.Add(list2);
                }
                else if (list1.val < list2.val)
                {
                    newList.Add(list1);
                    MergeTwoListsHelper(list1.next, list2);
                }
                else if (list1.val > list2.val)
                {
                    newList.Add(list2);
                    MergeTwoListsHelper(list2.next, list1);
                }
            }

            else if (newList.Count > 0 && list1 != null && list2 != null)
            {
                if (list1.val < list2.val)
                {
                    newList[^1].next = list1;
                    newList.Add(list1);
                    MergeTwoListsHelper(list1.next, list2);
                }
                else if (list2.val < list1.val)
                {
                    newList[^1].next = list2;
                    newList.Add(list2);
                    MergeTwoListsHelper(list2.next, list1);
                }
                else if (list1 == list2)
                {
                    newList[^1].next = list1;
                    newList.Add(list1);

                    newList[^1].next = list2;
                    newList.Add(list2);

                    MergeTwoListsHelper(list1.next, list2.next);
                }
            }
            
        }
    }
}
