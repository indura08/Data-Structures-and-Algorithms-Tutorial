using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions._100_same_tree_problem
{
    public class TreeNode
    {
        public int val;
        public TreeNode right;
        public TreeNode left;

        public TreeNode(int value, TreeNode right = null, TreeNode left = null)
        {
            this.val = value;
            this.right = right;

        }
    }
}