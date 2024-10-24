public class linkedlist {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head;
    public linkedlist(){
        this.head=null;
    }
    public void insertAtstart(int data){
        node newnode=new node(data);
        newnode.next=head;
        head = newnode;

    }
    public void display(){

        node i = head;
        while(i!=null){
            System.out.println(i.data+" ");
            i=i.next;
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtstart(10);
        list.display();
       
    }
}