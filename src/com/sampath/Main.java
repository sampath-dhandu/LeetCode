package com.sampath;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // int [] numbers= new int[3];
        // numbers[0]=10;
        // numbers[1]=20;
        // numbers[2]=20;
        //  int numbers[]={10,20,30};
        // System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers.length);


        /** Array array = new Array(3);
         array.insert(10);
         array.insert(20);
         array.insert(30);
         array.insert(40);
         // array.remove(4);
         //System.out.println(array.max());
         //System.out.println(array.indexOff(50));
         int arr[]= array.reverse();
         for(int i =0 ;i < arr.length ; i++){
         System.out.println(arr[i]);
         }
         // array.print();

         LinkedList list= new LinkedList();
         list.addLast(10);
         list.addLast(20);
         list.addLast(30);
         list.addFirst(5);
         System.out.println(list);

         var list =new LinkedList();
         list.addLast(10);
         list.addLast(20);
         list.addLast(30);
         // list.reverse();
         System.out.println(list.getKthElement(-1));
         // System.out.println(Arrays.toString(list.toArray()));

         Stack stack =new Stack();
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         System.out.println(stack);
         stack.pop();
         System.out.println(stack);
         var value=stack.peek();
         System.out.println(value);
         System.out.println(stack);

         String str = "abcde";
         StringRversal stringRversal= new StringRversal();
         System.out.println(stringRversal.reversal(str));

         StackArray stackArray= new StackArray();
         stackArray.push(10);
         stackArray.push(20);
         stackArray.push(30);

         System.out.println(stackArray.peek());

         Queue<Integer> queue = new ArrayDeque<>();
         queue.add(10);
         queue.add(20);
         queue.add(30);
         // var front = queue.remove();
         //System.out.println(front);
         //System.out.println(queue);
         // reverse(queue);

         ArrayQueue arrayQueue =new ArrayQueue(5);
         arrayQueue.enqueue(10);
         arrayQueue.enqueue(20);
         arrayQueue.enqueue(30);
         arrayQueue.dequeue();
         arrayQueue.dequeue();
         arrayQueue.enqueue(40);
         arrayQueue.enqueue(50);
         arrayQueue.enqueue(60);
         arrayQueue.enqueue(70);
         arrayQueue.dequeue();
         arrayQueue.enqueue(80);

         System.out.println(arrayQueue.toString());

         QueueWithStack queue= new QueueWithStack();
         queue.enqueue(10);
         queue.enqueue(20);
         queue.enqueue(30);
         queue.dequeue();
         queue.dequeue();
         queue.dequeue();
         var first=  queue.dequeue();
         System.out.println(first);

         PriorityQueue priorityQueue = new PriorityQueue();
         priorityQueue.add(90);
         priorityQueue.add(10);
         priorityQueue.add(30);
         priorityQueue.add(40);
         while (!priorityQueue.isEmpty()){
         System.out.println(priorityQueue.remove() );

         PriorityQuewithArray priorityQuewithArray = new PriorityQuewithArray();
         priorityQuewithArray.add(50);
         priorityQuewithArray.add(30);
         priorityQuewithArray.add(20);
         System.out.println(priorityQuewithArray.toString());
         while ((!priorityQuewithArray.isEmpty())){
         System.out.println(priorityQuewithArray.remove());
         } */

        //System.out.println(new StringRepetChar().nonRepetedChar("a green apple"));
        //   CharFinder charFinder = new CharFinder();
        // System.out.println(charFinder.findFirstRepetChar("a green apple"));

        //  System.out.println(hash("123456-A"));
        //String str ="orange";
        //System.out.println(str.hashCode());
       /* HashTable hashTable= new HashTable();
        hashTable.put(6,"A");//1
        hashTable.put(8,"B");//3
        hashTable.put(11,"B");//2
        System.out.println("Done");
        Tree tree= new Tree();
        tree.inset(7);
        tree.inset(4);
        tree.inset(9);
        tree.inset(1);
        tree.inset(6);
        tree.inset(8);
        tree.inset(10);
        //tree.traversePostOrder();

        Tree tree1= new Tree();
        tree1.inset(7);
        tree1.inset(4);
        tree1.inset(9);
        tree1.inset(1);
        tree1.inset(6);
        tree1.inset(8);
       // tree1.inset(10);
        System.out.println(tree.equals(tree1));*/

        //AVLTree avlTree = new AVLTree();
        //avlTree.insert(30);
        //avlTree.insert(20);
        //avlTree.insert(10);

        //  Tree tree= new Tree();
        //   tree.inset(2);
        //   tree.inset(2);
        //  tree.inset(2);
        // System.out.println(tree.treeHight());
        var graph = new Graph();
        graph.addNode("3");
        graph.addNode("9");
        graph.addNode("20");
        graph.addNode("15");
        graph.addNode("7");
        graph.addEdge("3", "9");
        graph.addEdge("3", "20");
        graph.addEdge("20", "15");
        graph.addEdge("20", "7");
        graph.traversalBredthFirst("3");
       // System.out.println(graph.topological());
       // graph.print();
        //3
    //  9       20
    //       15    7

    }


    public static int hash(String key) {
        int hash = 0;
        for (char ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }
}

