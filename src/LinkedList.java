
public class LinkedList {

	ListElement head; //declaration
	
	public void addElement(ListElement le){//addElement function
		ListElement temp = head;//set ListElement temp =equal to the head
		if(head == null){
			head = le;
		}
		else
		{
			while(temp.get_next_el() != null)//while the element in the linked list is not equal to null get the next element
			{
				temp = temp.get_next_el();
			}

			temp.set_next_el(le);
		}
	}
	
	public ListElement getElement(int index){//getElement function
		ListElement temp = head;//set the temp to equal head
		int count = 0;

		if(temp == null){//if the temp equals null, that means there are no elements
			System.out.print("There are no elements available\n");
			return(temp);
		}

		while(count < index && temp != null){//increments position in linked list
			temp = temp.get_next_el();
			count++;
		}

		return(temp);
	}
	public ListElement deleteElement(int index){//deleteElement function
		ListElement prev = null;
		ListElement curr = head; 
		
		if(head == null){//if head is equal to null, there are no elements in the list
			System.out.print("There are no elements to delete.\n");
			return(head);
		}else{
			if(head.getData() == index){//if the position index equals the position in the linked list, return the next element
				head = head.get_next_el();
				return(head);
			}

			while(curr != null && curr.getData() != index){
				prev = curr; //previous is equal to current as long as current is not equal to null and not equal to the index
				curr = curr.get_next_el();//get the next element
			}

			if(curr == null){
				System.out.print("That node does not exist\n");
				return(curr);
			}else{
				prev.set_next_el(curr.get_next_el());
			}

			return(prev);
		}
	}
	public void printLinkedListHead(){//print function
		ListElement temp = head;

		if(temp == null){
			System.out.print("The list is currently empty.\n");
		}else if(temp.get_next_el() == null){
			System.out.print(temp.getData() + " ");
		}else{
			do{
				System.out.print(temp.getData() + " ");
				temp = temp.get_next_el();
			}while(temp != null);

		}
		System.out.print("\n");
	}
	public void printLinkedListTail(ListElement le){//print starting with the tail function
		  if(le==null){
			   return;
			  }
			  printLinkedListTail(le.get_next_el());
			  System.out.print(le.getData() + " " );
			 }
		
	

}
