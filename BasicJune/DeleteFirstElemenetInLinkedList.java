public class DeleteFirstElemenetInLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void firstDelete(){
        if(head==null){
            return;
        }
        head=head.next;
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
            System.out.println("Empty Linked List");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
        System.out.print('\n');
    }

    public static void main(String[] args){
        DeleteFirstElemenetInLinkedList list=new DeleteFirstElemenetInLinkedList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.printList();

        list.firstDelete();
        list.printList();
    }
}
