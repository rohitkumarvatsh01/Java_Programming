class ReverseLinkedList{
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
    }

    public void reverseLinkedList(){

        if(head==null){
            return;
        }

        if(head.next==null){
            return;
        }

        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=preNode;

            //Update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }

    public static void main(String[] args){
        ReverseLinkedList list=new ReverseLinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.printList();
        
        System.out.println();
        
        list.reverseLinkedList();
        list.printList();
    }
}