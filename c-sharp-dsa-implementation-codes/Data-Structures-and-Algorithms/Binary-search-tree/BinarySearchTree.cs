using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Binary_search_tree
{
    class BinarySearchTree
    {
        BSTNode root;

        public void Insert(BSTNode newNode)
        {
            root = InsertHelper(root, newNode);
        }

        public BSTNode InsertHelper(BSTNode root, BSTNode newNode)
        {
            int data = newNode.data;

            if (root == null)
            {
                root = newNode;
                return root;
            }
            else if (root.data < newNode.data)
            {
                root.right = InsertHelper(root.right, newNode);
            }
            else 
            {
                root.left = InsertHelper(root.left, newNode);
            }

            return root;
        }
    }
}
