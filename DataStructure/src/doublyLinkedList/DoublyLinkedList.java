package doublyLinkedList;

public class DoublyLinkedList 
{
 
	Node head;
	
	
	public void insert(int data)
	{
	  	Node node = new Node();
	  	
	  	node.data=data;
	  	node.next=null;
	  	node.prev=null;
	  	
	  	if(head==null)
	  	{
	  		head=node;
	  	}
	  	else
	  	{
	  		Node n;
	  		n=head;
	  		
	  		while(n.next!=null)
	  		{
	  			n=n.next;
	  		}
	  		n.next=node;
	  		node.prev=n;
	  		n.prev=null;
	  	}
		
	}
	
	
	
	public void show()
	{
		Node node = head;
		  while(node.next!=null)
			{
			    System.out.println(node.data);
				node=node.next;
			}
		  System.out.println(node.data);
	}
	
	public void insertAtStart(int data)
	{
		
        Node node = new Node();
	  	
	  	node.data=data;
	  	node.next=head;
	  	head.prev=node;
	  	node.prev=null;
	  	head=node;
			
	}
	public void insertAtPosition(int index,int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node p;
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			p=n.next;
			node.next=n.next;
			p.prev=node;
			n.next=node;
			node.prev=n;
		}
		
	}
	public void insertAtEnd(int data)
	{
		Node node =new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		Node p= head;
		
		while(p.next!=null)
		{
			p=p.next;
		}
		p.next=node;
		node.prev=p;
		node.next=null;
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node p=head;
		   
			for(int i=0;i<index-1;i++)
			{
				p=p.next;
				
			}
			 Node n1;
			 Node n2;
			 n1=p.next;
			 n2=n1.next;
			 p.next=n1.next;
			 n2.prev=p;
			 n1=null;
			 
		}
	}
}
