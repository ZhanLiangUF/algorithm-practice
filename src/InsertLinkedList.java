import java.util.*;

public class InsertLinkedList
{
  Node head;  // head of list

  //Given a sorted linked list and a value to insert, write a function to insert the value in a sorted way.
  class Node
   {
       int data;
       Node next;
       Node(int d) {data = d; next = null; }
   }
  public void sortedInsert(Node node) {
    if (head == null || node.data < head.data) {
      node.next = head;
      head = node;
    } else {
      Node current;
      current = head;
      while(current.next != null && current.next.data < node.data) {
        current = current.next;
      }
      node.next = current.next;
      current.next = node;
    }
  }

  /* Function to create a node */
  Node newNode(int data)
  {
     Node x = new Node(data);
     return x;
  }

   /* Function to print linked list */
   public void printList()
   {
       Node temp = head;
       while (temp != null)
       {
          System.out.print(temp.data+" ");
          temp = temp.next;
       }
   }

   /* Driver function to test above methods */
   public static void main(String args[])
   {
       InsertLinkedList llist = new InsertLinkedList();
       Node new_node;
       new_node = llist.newNode(5);
       llist.sortedInsert(new_node);
       new_node = llist.newNode(10);
       llist.sortedInsert(new_node);
       new_node = llist.newNode(7);
       llist.sortedInsert(new_node);
       new_node = llist.newNode(3);
       llist.sortedInsert(new_node);
       new_node = llist.newNode(1);
       llist.sortedInsert(new_node);
       new_node = llist.newNode(9);
       llist.sortedInsert(new_node);
       System.out.println("Created Linked List");
       llist.printList();
   }
}
