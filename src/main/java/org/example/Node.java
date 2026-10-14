package org.example;

public class Node {
    // Task 1
    private int data;
    private Node next;

    public Node head=null;
    public Node tail=null;

    public Node(){}

    public Node(int d) {
      data=d;
      next=null;
    }

    public void addNode(int d){
        Node newNode= new Node(d);
        if (head==null){
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode; // <- adds new data behind current end
            tail= newNode; // <- newly added data becomes the end/tail
        }
    }

    public void displayTheList(){
        Node current = head;
        if(head==null){ // <- checks if list even has anything
            System.out.println("List empty");
            return;
        }
        System.out.println("Current list: ");
        while(current!=null){ // while the "head" isnt nothing theres something in list
            System.out.println(current.data);
            current=current.next; // <- takes next data in list as new head/current
        }
    }



    // Task 2

    public void insertFirst(int d){
        Node newNode = new Node(d);
        if (head==null){
            head=newNode; // <- if list is empty the new data added is the new start and end
            tail=newNode;
        } else {
         newNode.next = head; //<- new data is added
         head=newNode; //<- makes the new data the head/start of the list
        }
    }

    public void insertLast(int d){
        Node newNode = new Node(d);
        if(head==null){
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode; // same idea as adding new Node as it'll be added to last and made new tail
        }
    }

    public void deleteData(int target){
        if (head==null){
            System.out.println("List is empty");
        }
        Node current = head; // starts from start
        while(current.next!=null){
            if(current.data==target){

            }
        }

    }

    public boolean search(int target){ // only asked to see if it exists in the list + kinda like using key
        Node current= head; // pointer starts from the start of list
        boolean found = false;
        if(head==null){
            System.out.println("Empty list");
        }
        while (current!=null){
            if(current.data==target){ //comparing data w the target we looking for
                found=true;
            }
            current=current.next; // <- takes new data in list
        }
        return found;
    }

    public int size(){
        int listSize=0;
        Node current= head; // starts from heeeeeeeead
        while (current!=null){
            listSize=listSize+1;
            current=current.next; //pointer gives us next data
        }
        return listSize;
    }
}
