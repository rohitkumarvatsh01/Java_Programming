class AddElement{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        };
    }

    public void addElement(String data){

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
            System.out.println("List is Empty");;
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
    }

    public static void main(String[] args){
        AddElement list=new AddElement();

        list.addElement("Kumar");
        list.addElement("Rohit");
        list.addElement("is");
        list.addElement("Name");
        list.addElement("My");

        list.printList();

    }
}