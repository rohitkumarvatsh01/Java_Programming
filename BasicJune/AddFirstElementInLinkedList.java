class AddFirstElementInLinkedList{

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

    public void printList(){
        if(head==null){
            System.out.print("Linked List is Empty");
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
        AddFirstElementInLinkedList list=new AddFirstElementInLinkedList();
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);

        list.printList();
    }
}