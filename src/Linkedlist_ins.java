
public class Linkedlist_ins {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void printlist()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}	
	}
	
	public void push(int new_data)
	{
		Node newnode=new Node(new_data);
		newnode.next=head; //point the newnode to the old first element(head) and then make the newnode as head
		head=newnode;
	}
	public void insert(Node previous_node,int new_data)
	{
		Node newnode=new Node(new_data);
		if(previous_node==null)
		{
			System.out.println("Previous node cant be null");
			return;
		}
		newnode.next=previous_node.next;
		previous_node.next=newnode;
	}
	public void append(int new_data)
	{
		Node newnode=new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		newnode.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=newnode;
		return; 
		}
	
	public void deletenode(int key)
	{
		Node temp=head;
		Node prev=null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
	}
	
	public boolean search(Node head, int x)
	{
		Node current=head;
		while(current!=null)
		{
			if(current.data==x)
				return true;
			current=current.next;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Linkedlist_ins l=new Linkedlist_ins();
		l.head=new Node(100);
		Node second=new Node(200);
		Node  third=new Node(300);
		l.head.next=second;
		second.next=third;
		l.push(555);
		//l.insert(l.head.next, 222);
		l.insert(second, 999);
		l.append(124);
		l.append(7845);
		l.printlist();
		l.deletenode(300);
		System.out.println("------After Deletion--------");
		l.printlist();
		if(l.search(l.head, 200))
		System.out.println("Yes");
		else
			System.out.println("False");
	}
}
