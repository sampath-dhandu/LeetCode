/**
 * 
 */
package practise;

/**
 * @author sampathdhand
 *
 */
public class LinkedlistReveres {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedlistReveres list = new LinkedlistReveres();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	Node reverse(Node head) {
		Node prev = null;
		// Node current = node;
		// Node next = null;
		while (head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;

		}
		return prev;
	}

	static Node reverse1(Node head) {
		if (head == null || head.next == null)
			return head;

		/*
		 * reverse the rest list and put the first element at the end
		 */
		Node rest = reverse1(head.next);
		head.next.next = head;

		/* tricky step -- see the diagram */
		head.next = null;

		/* fix the head pointer */
		return rest;
	}
}
