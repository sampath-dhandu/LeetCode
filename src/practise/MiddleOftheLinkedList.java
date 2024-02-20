package practise;


public class MiddleOftheLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

		MiddleOftheLinkedList list = new MiddleOftheLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);

		System.out.println("Given Linked list");
		list.printList(head);
		Node curr=list.middleNode(head);
		System.out.println("Middle Linked list");
		list.printList(curr);
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public Node middleNode(Node head) {
		
		Node current=head;
		
		int length =1;
		
		while(current.next!=null)
		{
			current = current.next;
            length++;
		}
		
		int middle = length / 2 ;
		
		System.out.println("middle : "+middle);
		
		current = head;
        int i = 0;
        while(i < middle) {
            current = current.next;
            i++;
        }
		
		return current;

	}
}
