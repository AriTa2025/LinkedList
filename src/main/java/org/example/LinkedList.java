package org.example;

public class LinkedList {
    public static void main(String[] args) {
        Node singleLinkedList = new Node();
        // Task 1
       /* singleLinkedList.addNode(10);
        singleLinkedList.addNode(20);
        singleLinkedList.addNode(30);
        singleLinkedList.addNode(40);

        singleLinkedList.displayTheList();
        System.out.println("-----------------------");

        singleLinkedList.insertFirst(70);
        singleLinkedList.insertLast(100);
        System.out.println(" Does 30 exist in list " + singleLinkedList.search(30));
        System.out.println(" Does 90 exist in list " + singleLinkedList.search(90));
        System.out.println("Size: " + singleLinkedList.size());
        singleLinkedList.displayTheList();
    }
*/
        // Task 3
        singleLinkedList.addNode(15);
        singleLinkedList.addNode(25);
        singleLinkedList.addNode(35);
        singleLinkedList.addNode(45);
        singleLinkedList.displayTheList();

        singleLinkedList.insertFirst(5);
        singleLinkedList.insertLast(55);
        System.out.println("Is there a 35? " + singleLinkedList.search(35));
    }
}
