using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


using System.Collections.Generic;

namespace Data_Structures_and_Algorithms.LinkedList
{
    internal class LinkedListClass
    {
        public LinkedList<string> linkedlist1 = new LinkedList<string>();


        public void addItems() 
        {
            if (linkedlist1 == null)
            {
                linkedlist1.AddFirst(string.Empty);
            }

            else 
            {
                linkedlist1.AddLast(string.Empty);
            }
        }
        
    }
}
