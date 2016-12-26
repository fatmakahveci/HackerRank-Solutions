Node Insert(Node head,int data) {
    if(head==null) {
        head.data=data;
        return head;
    } else {
        Node cur=new Node();
        Node headTmp=head;
        while(head.next!=null)
            head=head.next;
        head.next=cur;
        cur.data=data;
        return headTmp;
    }
}
