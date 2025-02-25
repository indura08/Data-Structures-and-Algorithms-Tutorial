using Data_Structures_and_Algorithms.Graph_Adjecancy_Matrix;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
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

        public void Display() 
        {
            DisplayHelper(root);
        }

        public void DisplayHelper(BSTNode root)
        {
            if (root != null)
            {
                DisplayHelper(root.left);
                Console.Write(root.data + ", ");
                DisplayHelper(root.right);
            }
        }

        public void DisplayInDescendingOrder()
        {
            DisplayDescendingOrderHelper(root);
        }

        public void DisplayDescendingOrderHelper(BSTNode root)
        {
            if (root != null)
            {
                DisplayDescendingOrderHelper(root.right);
                Console.Write(root.data + ", ");
                DisplayDescendingOrderHelper(root.left);
            }

        }

        public string Search(int data)
        {
            if (SearchHelper(root, data))
            {
                return "Your value found value is : " + data;
            }
            else 
            {
                return "You value has not been found, please try again";
            }
        }

        public Boolean SearchHelper(BSTNode root, int data)
        {
            if (root == null)
            {
                return false;
            }
            else if (root.data == data)
            {
                return true;
            }
            else if (root.data > data)
            {
                return SearchHelper(root.left, data);
            }
            else 
            {
                return SearchHelper(root.right, data);
            }
        }
    }
}
