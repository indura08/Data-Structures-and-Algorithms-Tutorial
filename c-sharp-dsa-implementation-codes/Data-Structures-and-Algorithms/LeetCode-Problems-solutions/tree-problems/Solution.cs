using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions._100_same_tree_problem
{
    public class Solution
    {
        //100-same-tree-problem

        //public void ValuesAddingToList(TreeNode root)
        //{
        //    ValueAddingHelper(root);
        //}

        //List<int> treeValues = new List<int>();

        //public void ValueAddingHelper(TreeNode root)
        //{
        //    if (root != null)
        //    {
        //        ValueAddingHelper(root.left);
        //        treeValues.Add(root.val);
        //        ValueAddingHelper(root.right);
        //    }
        //    else if (root == null)
        //    {
        //        treeValues.Add(0);
        //    }
        //        //return treeValues;
        //}

        //public bool IsSameTree(TreeNode p, TreeNode q)
        //{
        //    ValueAddingHelper(p);
        //    ValueAddingHelper(q);

        //    if (treeValues.Count % 2 == 1)
        //    {
        //        return false;
        //    }
        //    else if (p == null && q == null)
        //    {
        //        return true;
        //    }
        //    else if (p == null || q == null)
        //    {
        //        return false;
        //    }
        //    else
        //    {
        //        int middle = treeValues.Count / 2;
        //        int[] rightArray = new int[middle];
        //        int[] leftArray = new int[middle];

        //        for (int i = 0; i < middle - 1; i++)
        //        {
        //            rightArray[i] = treeValues[i];
        //        }
        //        for (int j = 0; j < middle - 1; j++)
        //        {
        //            leftArray[j] = treeValues[j + middle];
        //        }

        //        if (rightArray.SequenceEqual(leftArray))
        //        {
        //            return true;
        //        }
        //        else
        //        {
        //            return false;
        //        }
        //    }
        //me uda code ekedi 64/67 test cases passed podi awalk thiynwa eki anik 3 pass natte


        public bool IsSameTree(TreeNode p , TreeNode q)
        {
            if (p == null && q == null)
            {
                return true;
            }
            else if (p == null || q == null)
            {
                return false;
            }
            else if (p.val != q.val)
            {
                return false;
            }
            else if (p.val == q.val)
            {
                return true;
            }

            return IsSameTree(p.left, q.left) && IsSameTree(p.right, q.right);
        }

        // 94. Binary Tree Inorder Traversal

        List<int> treeValList2 = new List<int>();
        public void InOrderTraversalHelper(TreeNode root, List<int> treeValList)
        {
            if (root != null)
            {
                InOrderTraversalHelper(root.left, treeValList);
                treeValList.Add(root.val);
                InOrderTraversalHelper(root.right, treeValList);
            }

        }

        public IList<int> InOrderTraversal(TreeNode root)
        {
            InOrderTraversalHelper(root, treeValList2);
            return treeValList2;
        }

        //108. Convert Sorted Array to Binary Search Tree

        public TreeNode SortedArrayToBST(int[] nums)
        {
            Array.Sort(nums);

            TreeNode root = new TreeNode(nums[0]);

            return root;

            //not finished , work to be done 


        }


    }
}
