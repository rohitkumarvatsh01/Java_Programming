import java.util.ServiceConfigurationError;

class AllOperation{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Add Element in First Node
    public void addFirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    //Add Element in Last Node
    public void addLast(int data){

        Node newNode=new Node(data);

        if(head==null){
            newNode=head;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //Delete Element in First Node
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    //Delete Element in Last Node
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLastNode=head;
        Node lasNode=head.next;
        while(lasNode.next!=null){
            lasNode=lasNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }

    //Print the Element in Linked list
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    //Main Method
    public static void main(String[] args){
        AllOperation list=new AllOperation();

        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}