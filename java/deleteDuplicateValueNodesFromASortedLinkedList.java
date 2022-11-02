Node RemoveDuplicates(Node head) {
    if(head==null)
        return head;
    Node newNode=head;
    while(head.next!=null) {
        if(head.data==head.next.data) {
            head.next=head.next.next;
        }
        else
            head=head.next;
    }
    return newNode;
}
