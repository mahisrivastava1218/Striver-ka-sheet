import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode prev_p=null;
        LinkedListNode cur_p=head;
        LinkedListNode next_p;
        while(cur_p!=null){
            next_p=cur_p.next;
            cur_p.next=prev_p;
            
            prev_p=cur_p;
            cur_p=next_p;
        }
        head=prev_p;
        return head;
    }
}
