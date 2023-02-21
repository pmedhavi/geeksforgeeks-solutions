

/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	Node temp=head;
	while(temp.next!=null){
	    if(temp.next==head){
	        return true;
	    }
	    temp=temp.next;
	}
	return false;
    }
}
