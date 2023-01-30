// https://www.youtube.com/watch?v=SMIq13-FZSE

package collectionConcepts;

public class CustomLinkedList {

	static Node head; // head of list

	// Method to create and insert new nodes to the LinkedList 
	public static void insert(int data) 
	{	
		// Create a new node with given data
		Node new_node= new Node(data);
		//	new_node.data=data;
		new_node.next=null;

		// If the Linked List is empty, then make the new node as head
		if(head==null) {
			head=new_node;
		}
		else {
			// Else traverse till the last node and insert the new_node there
			Node last_node=head;
			while(last_node.next!=null) {
				last_node=last_node.next;
			}
			// Insert the new_node at last node
			last_node.next=new_node;
		}		
	}

	// Method to print the LinkedList
	public static void print() 
	{
		Node current_node=head;
		// Traverse through the LinkedList
		while(current_node.next!=null) {
			System.out.println(current_node.data);
			current_node=current_node.next;
		}
		// Go to the next node
		System.out.println(current_node.data);
	}

	public static void main(String ar[]) {

		// Inserting node values to LinkedList
		insert(5);
		insert(0);
		insert(23);
		insert(12);
		insert(11);
		insert(9);
		// Printing node values of LinkedList
		print();
	}
}