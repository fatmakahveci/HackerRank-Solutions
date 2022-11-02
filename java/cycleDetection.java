boolean hasCycle(Node head) {
    if(head==null)
        return false;
    Node slower=head;
    Node faster=head.next;
    while(slower.next!=null && faster.next!=null) {
        slower=slower.next;
        faster=faster.next.next;
        if(slower==faster)
            return true;
    }
    return false;
}
