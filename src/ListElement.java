/**
 * 
 */

/**
 * @author james22m
 *
 */
public class ListElement {

	/**
	 * @param args
	 */
	private ListElement next;
	private ListElement previous;
	private int data;
	
	public ListElement()
	{
		this.data =0;
		this.next = null;
		this.previous = null;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void set_next_el(ListElement next) {
		this.next = next;
	}
	
	public ListElement get_next_el()
	{
		return this.next;
	}
	
	public void set_previous_el(ListElement previous)
	{
		this.previous = previous;
	}
	
	public ListElement get_previous_el()
	{
		return this.previous;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating linked list elements and setting values
		ListElement le = new ListElement();
		le.setData(5);
		
		ListElement le_2 = new ListElement();
		le.setData(4);
		
		ListElement le_3 = new ListElement();
		le.setData(3);
		
		ListElement le_4 = new ListElement();
		le.setData(2);
		
		ListElement le_5 = new ListElement();
		le.setData(1);
		
		//Print elements from ListElement Class
		System.out.println("Printing values obtained: ");
		System.out.println(le.getData() + " ");
		System.out.println(le_2.getData() + " ");
		System.out.println(le_3.getData() + " ");
		System.out.println(le_4.getData() + " ");
		System.out.println(le_5.getData() + " " + "\n");
		

		
		LinkedList list = new LinkedList();//Create Linked list

		
		//Adding elements to the LinkedList
		System.out.println("Adding elements to the Linked list...\n");
		list.addElement(le);
		list.addElement(le_2);
		list.addElement(le_3);
		list.addElement(le_4);
		list.addElement(le_5);
		
		list.printLinkedListHead();//Print all elements in the list
		list.printLinkedListTail(le);//Print all elements in the list starting with the tail
		System.out.print("\n");
		
		//Retrieving a specific element 
		ListElement temp = new ListElement();

		System.out.print("Retrieving element 0\n");
		temp = list.getElement(0);//item to retrieve
		System.out.print("Element 0 data = " + temp.getData() + "\n\n");

		System.out.print("Retrieve element 2\n");
		temp = list.getElement(2);//item to retrieve
		System.out.print("Element 2 data = " + temp.getData() + "\n\n");
		
		
		System.out.print("Deleting elements: \n");//Delete elements from the list
		
		System.out.print("Delete element with data 3: \n");
		list.deleteElement(3);
		list.printLinkedListHead();
		list.printLinkedListTail(le);
		
		System.out.print("\n");
		
		System.out.print("Deleting head: \n");//Delete head
		list.deleteElement(5);
		list.printLinkedListHead();
		
		System.out.print("Deleting tail: \n");//Delete head
		list.deleteElement(1);
		list.printLinkedListTail(le);
		
		System.out.print("\n");


	}
	
	
	
	

}

