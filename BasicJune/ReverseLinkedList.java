public class ReverseLinked=List{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(int data){
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

    public void printList(){
        if(head==null){
            System.out.println("Empty Linked List");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");

        System.out.println();
    }

    public void reverseLinkedList(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;

        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args){
        ReverseLinkedList list=new ReverseLinkedList();
        list.addfirst(1);
        list.addfirst(2);
        
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.reverseLinkedList();
        list.printList();
    }
}