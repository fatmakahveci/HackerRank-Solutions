Node Reverse(Node head) {
    if(head==null||head.next==null)
        return head;

    Node newHead=Reverse(head.next);
    head.next.next=head;
    head.next=null;

    return newHead;
}
