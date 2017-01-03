int GetNode(Node head,int n) {
    if(head==null)
        return 0;
    Node faster=head;
    Node slower=head;
    int i=0;
    while(i<n) {
        faster=faster.next;
        i++;
    }
    while(faster.next!=null) {
        faster=faster.next;
        slower=slower.next;
    }
    return slower.data;
}
