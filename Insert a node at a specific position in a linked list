/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node newNode=new Node();
    newNode.data=data;
    
    if(head==null || position==0) {
        newNode.next=head;
        return newNode;
    }
    
    int currPos=0;
    Node tempNode=head;
    while(currPos<position-1 && tempNode.next!=null) {
        tempNode=tempNode.next;
        currPos++;
    }
    Node tempNode2=tempNode.next;
    tempNode.next=newNode;
    newNode.next=tempNode2;
    
    return head;
}
