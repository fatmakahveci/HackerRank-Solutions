int FindMergeNode(Node headA, Node headB) {
    Node nodeA=headA;
    Node nodeB=headB;
    if(headA==null || headB==null)
        return 0;
    while(nodeA!=nodeB) {
        if(nodeA.next!=null)
            nodeA=nodeA.next;
        else
            nodeA=headB;
        if(nodeB.next!=null)
            nodeB=nodeB.next;
        else
            nodeB=headA;
    }
    return nodeA.data;
}
