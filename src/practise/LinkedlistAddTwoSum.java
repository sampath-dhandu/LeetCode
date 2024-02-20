package practise;

public class LinkedlistAddTwoSum {

    static Node head1, head2;

    static class Node {
        int val;
        Node next;
      //  int val;
        Node(int d) {
            val = d;
            next = null;
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedlistAddTwoSum list = new LinkedlistAddTwoSum();
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(4);

        System.out.print("first  Linked list - > ");
        list.printList(head1);

        LinkedlistAddTwoSum list1 = new LinkedlistAddTwoSum();
        list1.head2 = new Node(1);
        list1.head2.next = new Node(2);
        list1.head2.next.next = new Node(3);
        list1.head2.next.next.next = new Node(4);

        System.out.print("second Linked list ->");
        list1.printList(head2);
        Node result=addTwoSum(head1, head2);

        System.out.print("result Linked list ->");
        list1.printList(result);
        //head = list.reverse(head);
       /* System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
        list.printList(head);*/
    }
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

     private static Node addTwoSum(Node l1 , Node l2){
        Node dummy= new Node(0);

        Node  curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ?l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;

            System.out.println("x :"+x +"Y :" +y +"sum : " + sum + "carry : " + carry);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        //System.out.println("carry "+carry);
        if (carry > 0) {
            curr.next = new Node(carry);
        }
        return dummy.next;
    }

}
