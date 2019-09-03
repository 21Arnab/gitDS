package circualLinkedList;

public class CircularMain {

	public static void main(String[] args) 
	{
		CircularLinkedList list=new CircularLinkedList();
		
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insertStart(9);
		list.insertAtEnd(5);
		list.insertAtposition(7, -1);
		list.deleteAt(7);
		
		list.show();
	}

}
