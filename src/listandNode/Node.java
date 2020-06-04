package listandNode;

public class Node {
	int data; 
    Node prev; 
    Node next;
    
    public Node(int d){
    	data = d; 
    }
    
    static Node bubbleSort( Node start){  
        int swapped, i;  
        Node ptr1;  
        Node lptr = null;  
        if (start == null)  
            return null;  
        do{  
            swapped = 0;  
            ptr1 = start;  
      
            while (ptr1.next != lptr)  
            {  
                if (ptr1.data > ptr1.next.data)  
                {  
                    int t = ptr1.data; 
                    ptr1.data = ptr1.next.data; 
                    ptr1.next.data = t; 
                    swapped = 1;  
                }  
                ptr1 = ptr1.next;  
            }  
            lptr = ptr1;  
        }  
        while (swapped != 0);  
            return start; 
    }  
    
    static void selectionSort(Node head) 
    { 
        Node temp = head; 
        while (temp != null) { 
            Node min = temp; 
            Node r = temp.next;
            while (r != null) { 
                if (min.data > r.data) 
                    min = r; 
                r = r.next; 
            }
            int x = temp.data; 
            temp.data = min.data; 
            min.data = x; 
            temp = temp.next; 
        } 
    } 
}
