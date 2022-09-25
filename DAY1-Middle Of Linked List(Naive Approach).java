import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        int n=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        temp=head;
        for(int i=0;i<n/2;i++){
            temp=temp.next;
        }
        return temp;
    }
}
