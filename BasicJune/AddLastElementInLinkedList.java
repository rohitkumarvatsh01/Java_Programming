public class AddLastElementInLinkedList {
    
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
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
        currNode=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("Empty Linked list");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args){
        AddLastElementInLinkedList list=new AddLastElementInLinkedList();
        list.addLast(1);
        list.addLast(2);

        list.printList();
    }
}
