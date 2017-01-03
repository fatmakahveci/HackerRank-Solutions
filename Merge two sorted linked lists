Node MergeLists(Node headA, Node headB) {
    if(headA==null && headB==null)
        return null;
    else if(headB==null)
        return headA;
    else if(headA==null)
        return headB;
    if(headA.data<=headB.data) {
        headA.next=MergeLists(headA.next,headB);
        return headA;
    }
    else {
        headB.next=MergeLists(headA,headB.next);
        return headB;
    }
        
}
