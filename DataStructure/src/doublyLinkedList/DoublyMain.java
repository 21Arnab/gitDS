package doublyLinkedList;

public class DoublyMain {

	public static void main(String[] args)
	{
	
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		//list.insertAtStart(5);
		list.insertAtPosition(3,8);
		list.insertAtEnd(5);
		list.deleteAt(3);
		
		list.show();

	}

}
