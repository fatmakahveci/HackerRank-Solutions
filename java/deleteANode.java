/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    Node currentNode=head;
    if(head==null)
        return head;
    if(position==0) {
        head=head.next;
    }
    int currentIndex=0;
    while(currentIndex<position-1 && currentNode.next!=null) {
        currentIndex++;
        currentNode=currentNode.next;
    }
    currentNode.next=currentNode.next.next;
    return head;
}

