import javax.swing.plaf.ColorUIResource;

class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        
        if(head.next==null){
            head.next=null;
            return;
        }

        Node seconNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            seconNode=seconNode.next;
            lastNode=lastNode.next;
        }

        seconNode.next=null;
    }

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

    public static void main(String[] args){
        LinkedList list=new LinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.printList();

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}