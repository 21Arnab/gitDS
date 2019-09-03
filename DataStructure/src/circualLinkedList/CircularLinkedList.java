package circualLinkedList;

public class CircularLinkedList
{
    Node head=null;
    Node tail=null;
    
    public void insert(int data)
    {
    	Node node = new Node();
    	node.data=data;
        node.next=null;
    	
    	if(head==null)
    	{
    		
    		head=node;
    		tail = node;
    		node.next=head;
    	}
    	else
    	{
    		tail.next=node;
    		tail=node;
    		tail.next=head;
    		
    	}    	
    }
    
    public void insertStart(int data)
    {
    	Node node = new Node();
    	node.data=data;
        node.next=null;
        
        
        
        node.next=head;
        head=node;
        tail.next=head;
        
    }
    public void insertAtEnd(int data)
    {
    
    	Node node = new Node();
    	node.data=data;
        node.next=null;
        if(head==null)
        {
        	insertStart(data);
        }
        else
        {
        tail.next=node;
        tail=node;
        tail.next=head;
        }
    }
    public void insertAtposition(int index,int data)
    {
    	Node node = new Node();
    	node.data=data;
        node.next=null;
    	if(index==0)
    	{
    		insertStart(data);
    	}
    	else
    	{
    		Node n=head;
    		
    		for(int i=0;i<index-1;i++)
    		{
    			n=n.next;
    		}
    		node.next=n.next;
    		n.next=node;
    		
    	}
    }
    public void deleteAt(int index)
    {
       if(index==0)
       {
    	   head=head.next;
    	   tail.next=head.next;
       }
       else
       {
    	   
    	     Node n = head;
    	     Node n1=null;
    				
    	     for(int i=0;i<index-1;i++)
    		{
    			n=n.next;
    		}
    		n1=n.next;
    		n.next=n1.next;	
    				
          }
    	
    }
	
    public void show()
    {
    	 Node node = head;
   	  while(node.next!=head)
   		{
   		    System.out.println(node.data);
   			node=node.next;
   		}
   	  System.out.println(node.data);
   	  
    }
	
}
