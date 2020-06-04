package listandNode;

import java.util.LinkedList;

public class DoubleLL extends LinkedList{
	Node head;
	
	public void push(int new_data){ 
        Node new_Node = new Node(new_data); 
        new_Node.next = head; 
        new_Node.prev = null; 
        if (head != null) 
            head.prev = new_Node;
        head = new_Node; 
    } 
	static void printList(Node head)  
	{  
	    while (head != null)  
	    {  
	        System.out.print(head.data + " ");  
	        head = head.next;  
	    }  
	}  
}
