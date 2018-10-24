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
	
	public int getDta()
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
		

	}
	
	
	
	

}
