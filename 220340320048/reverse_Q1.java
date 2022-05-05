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
	
	void display(){
		Node n=head;
		while(n != null){
			System.out.print(n.data+ " ");
			n=n.next;
		}
	}
	
	void insert(int d){
		Node new_node=new Node(d);
		new_node.next=head;
		head=new_node;
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
		
		r.display();
		System.out.println();
		
		r.head =r.reverse(r.head);
		r.display();
	}
}