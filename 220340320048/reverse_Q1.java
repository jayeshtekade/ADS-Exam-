class reverse_Q2
{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	
	
	void insert(int data){
		Node new_node=new Node(data);
		if(head==null){
			head=new_node;
		}
		new_node.next=null;
		Node n=head;
		while(n!=null){
			n=n.next;
		}
		n.next=new_node;
	}
	
	Node reverse(Node head){
		Node n=head;
		Node prev=null;
		Node next=null;
		while(n != null){
			next=n.next;
			n.next = prev;
			prev = n;
            n = next;
		}
		head=prev;
		return head ;
	}
	
	public static void main(String args[]){
		reverse_Q2 r=new reverse_Q2();
		
		r.insert(1);
		r.insert(2);
		r.insert(3);
		
		
		r.reverse(r.head);
	}
}