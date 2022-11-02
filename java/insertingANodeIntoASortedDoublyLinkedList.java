Node SortedInsert(Node head,int data) {
    Node newNode=new Node();
    newNode.data=data;
    if(head==null)
        return newNode;
    else if(data<=head.data) {
        newNode.next=head;
        head.prev=null;
        return newNode;
    }
    else {
        Node listFirstNode=SortedInsert(head.next, data);
        head.next=listFirstNode;
        listFirstNode.prev=head;
        return head;
    }
}
