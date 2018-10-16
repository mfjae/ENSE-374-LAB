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
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
