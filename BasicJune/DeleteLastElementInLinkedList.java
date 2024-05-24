public class DeleteLastElementInLinkedList {
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
        System.out.print("null");
        System.out.println();
    }

    public void lastDelete(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public static void main(String[] args) {
        DeleteLastElementInLinkedList list=new DeleteLastElementInLinkedList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.printList();

        list.lastDelete();
        list.printList();
    }
}
